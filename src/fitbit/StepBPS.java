package fitbit;

import java.util.Random;

/**
 * StepBPS.java
 * AUTHOR: TEAM HUNGRY
 * CLASS: CSCI 360-01
 * PURPOSE: INTERPRETS INPUT DATA FROM SENSORS
 *      1) GETS RAW INPUTS FROM SENSORS
 *      2) CONVERTS INPUTS INTO BPS(FLOAT) AND STEP(INT) VALUES
 *      3) SENDS THESE VALUES TO THE STEPBPS DATASET
 */

public class StepBPS {
    private static void getData(){
        //for now, no simulated inputs - just simulated trash data
        //sensorTime should be initialized to = System.nanoTime();
        //from there on it should maintain itself
        //SetSteps(steapCheat());
        //SetBPS(BPSCheat());
    }

    public static int stepCheat(){
        return 5;
    }

    public static int BPSCheat(){
        Random rand = new Random();
        int random = rand.nextInt(5)+146;
        return random;
    }
    //Generates Data around the average heart rate for a given activity
        //Ex: Resting Heartrate is anywhere from 60 to 100 Beats per minute.
            //-So for generating these numbers do we want them in BPS or BPM? (BPM IS WAY EASIER)
            //Could implement BPS with a circular array
                //- Get data every second and  start averaging every second (becomes more accurate the longer it runs)
                //  The array would run from 0 to 59. Once it hits 60 that would just replace 0 and it would continue up replacing numbers
}
