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

    private void update(){

    }

    private void setHearRate(HAC HR){
        heartRate = HR.getHeartRate();
    }

    private void setActivity(HAC Act){
        activity = Act.getActivity();
    }

    public void setCaloriesBurned(UserData u1, float time){
        HAC cal = new HAC();
        DataExpert D1 = new DataExpert();
        int BPS = D1.getBPSData();
        caloriesBurned = caloriesBurned + cal.getCalories(u1, time, BPS);
    }

    public float getActivity() {
        return activity;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public double getCaloriesBurned(UserData u1, float time) {
        setCaloriesBurned(u1, time);
        return caloriesBurned;
    }
}



