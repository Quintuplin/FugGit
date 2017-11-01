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

    private int [] heartRate;
    private int calories;
    private float activity;

    private void calculateHeartRate(...){

        heartRate[0] = ...;
    }

    private void calculateCalories(int age, int height, int weight, ...){
        calories = ...;
    }

    private void calculateActivity(...){
        activity = ...;
    }


    public int [] getHeartRate(){
       return heartRate;
    }

    public int getCalories() {
        return calories;
    }

    public float getActivity() {
        return activity;
    }
}
