package fitbit;

import java.util.Random;

/**
 * Sensors.java
 * Team Hungry
 * CSCI 360-01
 * Generates Realistic Sensor Data
 */

public class Sensors {
    //without real sensors, we went with simply generating data to pour into our other classes

    //returns step data
    public static int stepCheat(){
        Random rand = new Random();
        //went with a semi-random step adder just so that it's not perfectly uniform
        return rand.nextInt(10)/8;
    }

    //returns BPS data
    public static int BPSCheat(){
        Random rand = new Random();
        //large randomization is less realistic but more capably shows off the flexibility of ActivityCalories' calculations.
        //alternatively, small randomization is more realistic, but shows off less
        return rand.nextInt(100)+50;
    }
}
