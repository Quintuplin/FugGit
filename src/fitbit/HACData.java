package fitbit;

import sun.nio.cs.US_ASCII;

/**
 * HACData.java
 * AUTHOR: TEAM HUNGRY
 * CLASS: CSCI 360-01
 * PURPOSE: STORES HEARTRATE, ACTIVITY, AND CALORIES BURNED
 *      1) MAINTAINS THE DATASET
 *      2) RESETS AT MIDNIGHT
 *      3) PASSES DATA ON WHEN ASKED
 */

public class HACData {
    private int heartRate;
    private double caloriesBurned;
    private float activity;

    public HACData(){
        heartRate = 0;
        caloriesBurned = 0;
        activity = 0;
    }

    //Sets heartRate by calling HAC
    private void setHeartRate(HAC HR){
        heartRate = HR.getHeartRate();
    }

    private void setActivity(HAC Act){
        activity = Act.getActivity();
    }

    //Sets caloriesBurned in HACData by creating an instance of HAC and passing the necessary params
    private void setCaloriesBurned(UserData u1, float time, StepBPSData BPSData){
        HAC cal = new HAC();
        caloriesBurned = caloriesBurned + cal.getCalories(u1, time, BPSData);
    }

    public float getActivity() {
        return activity;
    }

    //Pulls the heartRate and updates it at the same time
    public int getHeartRate() {
        HAC HAC1 = new HAC();
        setHeartRate(HAC1);
        return heartRate;
    }

    //Gets the calories burned but updates it first before calling it
    public double getCaloriesBurned(UserData u1, float time, StepBPSData BPSData) {
        setCaloriesBurned(u1, time, BPSData);
        return caloriesBurned;
    }
}



