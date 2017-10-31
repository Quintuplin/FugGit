package fitbit;

import static java.lang.Math.random;

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

    public static void main(String[] args) {

    }

    private static void getData(){
        //for now, no simulated inputs - just simulated trash data
        //sensorTime should be initialized to = System.nanoTime();
        //from there on it should maintain itself
        SetSteps(steapCheat());
        SetBPS(BPSChear());
    }

    private static int stepCheat(){
        return 1;
    }

    private static float BPSCheat(){
        return float1.0;
    }
}
