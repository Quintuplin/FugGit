package fitbit;

/**
 * HAC.java
 * AUTHOR: TEAM HUNGRY
 * CLASS: CSCI 360-01
 * PURPOSE: HEARTRATE, ACTIVITY, CALORIES
 * OTHER:
 *      1) PULLS NEEDED INFORMATION FROM StepBPSData, Clock, and UserData
 *      2) CALCULATES HEARTRATE, ACTIVITY RATIO, AND CALORIES BURNED
 *      3) SENDS VALUES TO HACData
 */

public class HAC {

    private int heartRate;
    private double caloriesBurned;
    private float activity;

    public HAC(){
        heartRate = 0;
        caloriesBurned = 0;
        activity = 0;
    }


    private void calculateHeartRate(){
        DataExpert D1 = new DataExpert();
        heartRate = D1.getBPSData();

    }

    //Male: ((-55.0969 + (0.6309 x HR) + (0.1988 x W) + (0.2017 x A))/4.184) x 60 x T
    //Female: ((-20.4022 + (0.4472 x HR) - (0.1263 x W) + (0.074 x A))/4.184) x 60 x T
    // [ (AGE_IN_YEAR x 0.2017) - (WEIGHT_IN_KILOGRAM x 0.09036)+ (HEART_BEAT_PER_MINUTE x 0.6309) - 55.0969] x DURATION_IN_MINUTE / 4.184
    //Calories Burned = [(Age x 0.074) — (Weight x 0.05741) + (Heart Rate x 0.4472) — 20.4022] x Time / 4.184.

    private double calculateCalories(int age, double weight, char sex, int heartRate, double time){
        if (sex == 'm'){
            return (((age * 0.2017)- (weight * 0.09036) + (heartRate* 0.6309) - 55.0969) * time) / 4.184;
            //CANT FIND WHICH TO USE ((-55.0969 + (0.6309 * heartRate) + (0.1988 * weight) + (0.2017 * age))/4.184) * 60 * time;
        }
        else{
            return (((age * 0.074)- (weight * 0.05741) + (heartRate* 0.4472) - 20.4022) * time) / 4.184;
        }
    }

/*    private void calculateActivity(...){
        activity = ...;
    }
*/

    private void getUserData(){

    }

    private void updateCal(UserData u1, float time1, int BPS1){ //Pass Settings Expert
        //Settings expert gets User data here
        heartRate = BPS1;
        int age = u1.getAge();
        float weight = u1.getWeight();
        char sex = u1.getSex();
        float time = time1;
        caloriesBurned = calculateCalories(age, weight, sex, heartRate, time);
    }


    public int getHeartRate(){
       return heartRate;
    }

    public double getCalories(UserData u1, float time, int BPS1) {
        updateCal(u1, time, BPS1);
        return caloriesBurned;
    }

    public float getActivity() {
        return activity;
    }
}
