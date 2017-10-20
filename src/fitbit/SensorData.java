package fitbit;

import static java.lang.Math.random;

/**
 * SensorData.java
 * AUTHOR: TEAM HUNGRY
 * CLASS: CSCI 360-01
 * PURPOSE: TO TRACK SENSORS AND INTERPRET/STORE DATA IN RAW DATASET
 * OTHER:
 *      1) TRACKS INPUT FROM SENSORS INTO TEMPORARY MEMORY
 *      2) INTERPRETS DATA INTO CALCULATION-FRIENDLY FORMAT
 *              a) INTERPRETS ANALOG ACCELEROMETER DATA INTO INT STEPS
 *              b) INTERPRETS ANALOG HEARTRATE DATA INTO FLOAT BPS
 *      3) CALLS DATAIO TO OUTPUT FINISHED INFO TO RAW DATA
 *
 *      RDD: CREATES DATA
 */
class SensorData {
    public static void main(String[] args) {

    }

    private static void getData(){
        //for now, no simulated inputs - just simulated trash data
        //sensorTime should be initialized to = System.nanoTime();
        //from there on it should maintain itself
        inputCheat();
    }

    private static void inputCheat(){
        DataExpert.addSteps(1);
        DataExpert.addBPS(60+20*random());
    }
}
