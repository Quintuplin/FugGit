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

    private static float seconds;

    public static void init(){
        seconds = System.nanoTime();
    }

    static int time(int minutes) {
        if(System.nanoTime() - 60000 <= seconds){
            return minutes;
        }
        else {
            init();
            return ++minutes;
        }
    }

}