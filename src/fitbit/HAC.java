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

    private float heartRate;
    private int calories;
    private float activity;

    /rivate void calculateHeartRate(...){

        heartRate[0] = ...;
    }

    //Male: ((-55.0969 + (0.6309 x HR) + (0.1988 x W) + (0.2017 x A))/4.184) x 60 x T
    //Female: ((-20.4022 + (0.4472 x HR) - (0.1263 x W) + (0.074 x A))/4.184) x 60 x T




    public void calculateCalories(int age, int weight, char sex, float heartRate){
        if (sex == 'm'){
            calories = ((-55.0969 + (0.6309 * heartRate[]) + (0.1988 * weight) + (0.2017 * age))/4.184) * 60 * TIME;
        }
        else{
            ((-20.4022 + (0.4472 * HR) - (0.1263 * W) + (0.074 * A))/4.184) * 60 * TIME;
        }
    }

    private void calculateActivity(...){
        activity = ...;
    }

*/

    public float getHeartRate(){
       return heartRate;
    }

    public int getCalories() {
        return calories;
    }

    public float getActivity() {
        return activity;
    }
}
