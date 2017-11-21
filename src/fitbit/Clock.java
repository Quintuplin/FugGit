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
    private static long init = System.nanoTime();
    //init = # minutes today
    static int time(int minutes) {
        if(System.nanoTime() - 1000 > init){
            return minutes;
        }
        else return ++minutes;
    }

}