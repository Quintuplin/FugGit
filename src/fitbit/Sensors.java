package fitbit;

import java.util.Random;

/**
 * Sensors.java
 * Team Hungry
 * CSCI 360-01
 * Generates Realistic Sensor Data
 */

public class Sensors {
    //returns step data
    public static int stepCheat(){
        Random rand = new Random();
        return rand.nextInt(10)/8;
    }

    //returns BPS data
    public static int BPSCheat(){
        Random rand = new Random();
        return rand.nextInt(50)+80;
    }
}
