package fitbit;

/**
 * Clock.java
 * AUTHOR: TEAM HUNGRY
 * CLASS: CSCI 360-01
 * PURPOSE: Calculates date and time
 * OTHER:
 *      1) READS SETTINGS FROM CLOCKDATA
 *      2) INTERPRETS THAT PLUS INTERNAL TIMER TO CALCULATE CURRENT DATE, TIME, AND PROGRESS ON ALARMS, TIMERS
 *      3) RECORDS WHEN MIDNIGHT IS REACHED (NEW DAY), AND SENDS A RESET MARKER TO ALL DATA SETS
 */

class Clock {

    //ISSUES
    //UNCHECKED USE OF STATIC
    //MINUTES COUNTER IS ITERATING INCORRECTLY

    private static float newMinute;

    public static void init(){
        newMinute = System.nanoTime()/(float)1000000000.0;
    }

    static double time(float minutes) {
        float seconds = System.nanoTime()/(float)1000000000.0 - newMinute;
        if(seconds - 60 <= newMinute){
            return minutes + seconds/100 ;
        }
        else {
            init();
            return ++minutes + seconds/100;
        }
    }

    //todo timer
    //toto start/stop timer, get time elapsed
}