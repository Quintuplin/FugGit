package fitbit;

//import sun.nio.cs.US_ASCII;

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

//    HACData hacData = new HACData();
 //   ActivityCalories hac = new ActivityCalories();

    public HACData(){
        heartRate = 0;
        caloriesBurned = 0;
        activity = 0;
    }

    //Sets heartRate by calling ActivityCalories
    private void setActivity(ActivityCalories Act){
        //activity = Act.getActivity();
    }

    //Sets caloriesBurned in HACData by creating an instance of ActivityCalories and passing the necessary params
    private void setCaloriesBurned(UserData u1, float time){
        ActivityCalories cal = new ActivityCalories();
        //caloriesBurned = caloriesBurned + cal.getCalories(u1, time);
    }

    public float getActivity() {
        return activity;
    }

    //Pulls the heartRate and updates it at the same time
    public int getHeartRate() {
       // ActivityCalories HAC1 = new ActivityCalories();
        //heartRate = HAC1.setHACDataHeartRate();
        //ActivityCalories.setHeartRate();
        return this.heartRate;
    }

    //Gets the calories burned but updates it first before calling it
    public double getCalories(){//UserData u1, float time) {
        //setCaloriesBurned(u1, time);
        //this.caloriesBurned = hacData.getCalories();

        return this.caloriesBurned;
    }
}



