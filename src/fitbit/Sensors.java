package fitbit;

import java.util.Random;

/**
 * Sensors.java
 * AUTHOR: TEAM HUNGRY
 * CLASS: CSCI 360-01
 * PURPOSE: GENERATES REALISTIC SENSOR DATA
 */

public class Sensors {
    //returns step data
    public static int stepCheat(){
        Random rand = new Random();
        return rand.nextInt(10)/6;
    }

    //returns BPS data
    public static int BPSCheat(){
        Random rand = new Random();
        return rand.nextInt(5)+146;
    }

    //Generates Data around the average heart rate for a given activity
        //Ex: Resting Heartrate is anywhere from 60 to 100 Beats per minute.
            //-So for generating these numbers do we want them in BPS or BPM? (BPM IS WAY EASIER) >>DEFINITELY BPM
            //Could implement BPS with a circular array
                //- Get data every second and  start averaging every second (becomes more accurate the longer it runs)
                //  The array would run from 0 to 59. Once it hits 60 that would just replace 0 and it would continue up replacing numbers
}
