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

    private double caloriesBurned = 0;
    //private float activity = 0;

    //CALORIES BURNED FORMULA
    //Male: ((-55.0969 + (0.6309 x HR) + (0.1988 x W) + (0.2017 x A))/4.184) x 60 x T
    //Female: ((-20.4022 + (0.4472 x HR) - (0.1263 x W) + (0.074 x A))/4.184) x 60 x T
    //[ (AGE_IN_YEAR x 0.2017) - (WEIGHT_IN_KILOGRAM x 0.09036)+ (HEART_BEAT_PER_MINUTE x 0.6309) - 55.0969] x DURATION_IN_MINUTE / 4.184
    //Calories Burned = [(Age x 0.074) — (Weight x 0.05741) + (Heart Rate x 0.4472) — 20.4022] x Time / 4.184.


    //Calculates the amount of calories burned based on the User Data and time spent being active, as well
    // as the average heart rate over that time
    private double calculateCalories(int age, double weight, boolean isMale, int BPM, double time){
        if (isMale){
            double V02Max = ((-55.0969 + (.6309 * BPM) + (.1988 * weight) + (.2017 * age)) / 4.184) * 60 * time;
            return ((-95.7735 + (.634 * BPM) + (.404 * V02Max) + (.394 * weight) + (.271 * age)) / 4.184) * 60 * time;
        } else{ //if female
            double V02Max = ((-20.4022 + (.4472 * BPM) + (.1263 * weight) + (.074 * age)) / 4.184) * 60 * time;
            return ((-59.3954 + (.45 * BPM) + (.380 * V02Max) + (.103 * weight) + (.274 * age)) / 4.184) * 60 * time;
        }
    }

    //Updates the calories burned based on User Data, the time spent active and the average heart rate over that time
    private void updateCal(UserData userData, float time){
        StepsHeartrate stepsHeartrate = new StepsHeartrate();
        int age = userData.getAge();
        float weight = userData.getWeight();
        boolean isMale = userData.getSex();
        caloriesBurned = calculateCalories(age, weight, isMale, stepsHeartrate.getBPM(), time);
    }

    //Gets calories from ActivityCalories and updates it at the same time
    public double getCalories(UserData u1, float time) {
        //Create new settings expert which finds UserData. This allows UserData to be decoupled (CANT THINK OF SOLUTION YET!!!)
        UserData U1 = new UserData();
        updateCal(U1, time);
        return caloriesBurned;
    }
}
