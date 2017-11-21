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

public class Clock {
    static double init = .0001;
    private static long time = System.nanoTime();

    public static int time() {
        return (int) ((System.nanoTime() - time) * init);//DataExpert.getTimeData());
    }

}