package fitbit;

/**
 * ActivityCalories.java
 * AUTHOR: TEAM HUNGRY
 * CLASS: CSCI 360-01
 * PURPOSE: HEARTRATE, ACTIVITY, CALORIES
 * OTHER:
 *      1) PULLS NEEDED INFORMATION FROM StepsHeartrate, Clock, and UserData
 *      2) CALCULATES HEARTRATE, ACTIVITY RATIO, AND CALORIES BURNED
 *      3) SENDS VALUES TO HACData
 */

public class ActivityCalories {

    private int heartRate;
    private double caloriesBurned;
    private float activity;

    public ActivityCalories(){
        heartRate = 0;
        caloriesBurned = 0;
        activity = 0;
    }

    //Calculates the heart rate by aquiring the BPS data from StepsHeartrate
    private void calculateHeartRate(StepsHeartrate BPM){
        heartRate = BPM.getBPM();
    }

    //Male: ((-55.0969 + (0.6309 x HR) + (0.1988 x W) + (0.2017 x A))/4.184) x 60 x T
    //Female: ((-20.4022 + (0.4472 x HR) - (0.1263 x W) + (0.074 x A))/4.184) x 60 x T
    // [ (AGE_IN_YEAR x 0.2017) - (WEIGHT_IN_KILOGRAM x 0.09036)+ (HEART_BEAT_PER_MINUTE x 0.6309) - 55.0969] x DURATION_IN_MINUTE / 4.184
    //Calories Burned = [(Age x 0.074) — (Weight x 0.05741) + (Heart Rate x 0.4472) — 20.4022] x Time / 4.184.


    //Calculates the amount of calories burned based on the User Data and time spent being active, as well
    //as the average heart rate over that time
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

    //Updates the calories burned based on User Data, the time spent active and the average heart rate over that time
    private void updateCal(UserData u1, float time1){
        StepsHeartrate BPS1 = new StepsHeartrate();
        calculateHeartRate(BPS1);
        int age = u1.getAge();
        float weight = u1.getWeight();
        char sex = u1.getSex();
        float time = time1;
        caloriesBurned = calculateCalories(age, weight, sex, heartRate, time);
    }

    //Gets heart rate by creating a new instance of StepsBPSData and acquiring the necessary BPS data. It also updates the HeartRate of ActivityCalories
    public int setHACDataHeartRate(){
        StepsHeartrate NEWHRT = new StepsHeartrate();
        calculateHeartRate(NEWHRT);
        return heartRate;
    }
    //Gets calories from ActivityCalories and updates it at the same time
    public double getCalories(){//UserData u1, float time) {
        //Create new settings expert which finds UserData. This allows UserData to be decoupled (CANT THINK OF SOLUTION YET!!!)
        UserData U1 = new UserData();

        //updateCal(U1, //time);
        return caloriesBurned;
    }

    public float getActivity() {
        return activity;
    }
}
