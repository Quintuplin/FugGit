package fitbit;

/**
 * ActivityCalories.java
 * AUTHOR: TEAM HUNGRY
 * CLASS: CSCI 360-01
 * PURPOSE: HEARTRATE, ACTIVITY, CALORIES
 * OTHER:
 *      1) PULLS NEEDED INFORMATION FROM StepsHeartrate, Clock, and UserData
 *      2) Calculates ACTIVITY RATIO, AND CALORIES BURNED
 */

public class ActivityCalories {

    private double caloriesBurned = 0;
    private float activity = 0;
    float aBPM = 0;
    int i = 0;

    //finds average BPM for current day
    private double averageBPM() {
    //    aBPM += StepsHeartrate.getBPM() - aBPM / i++;
        return 0.0;
    }

    //Calculates the amount of calories burned in current day
    private double calculateCalories(int age, double weight, boolean isMale, int BPM, double time){
        if (isMale){
            double V02Max = ((-55.0969 + (.6309 * BPM) + (.1988 * weight) + (.2017 * age)) / 4.184) * 60 * time;
            return ((-95.7735 + (.634 * BPM) + (.404 * V02Max) + (.394 * weight) + (.271 * age)) / 4.184) * 60 * time;
        } else{ //if female
            double V02Max = ((-20.4022 + (.4472 * BPM) + (.1263 * weight) + (.074 * age)) / 4.184) * 60 * time;
            return ((-59.3954 + (.45 * BPM) + (.380 * V02Max) + (.103 * weight) + (.274 * age)) / 4.184) * 60 * time;
        }
    }

    //Gets calories from ActivityCalories and updates it at the same time
    public double getCalories(){
        int age = 25;
        int weight = 155;
        boolean isMale = true;
        double time = 10000.0;
        caloriesBurned = calculateCalories(age, weight, isMale, (int)aBPM, time);
        return caloriesBurned;
    }

    public float getActivity(){
        if (Sensors.BPSCheat() > 60)
            activity += .25;
        return activity;
    }
}