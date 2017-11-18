package fitbit;

/**
 * Clock.java
 * AUTHOR: TEAM HUNGRY
 * CLASS: CSCI 360-01
 * PURPOSE: STORES SETTINGS FOR DATE/TIME, ALARM, AND TIMER
 * OTHER:
 *      1) READS SETTINGS FROM CLOCKDATA
 *      2) INTERPRETS THAT PLUS INTERNAL TIMER TO CALCULATE CURRENT DATE, TIME, AND PROGRESS ON ALARMS, TIMERS
 *      3) RECORDS WHEN MIDNIGHT IS REACHED (NEW DAY), AND SENDS A RESET MARKER TO ALL DATA SETS
 */

public class Clock {
    public static int getTime(){
        int x = ClockData.getTimeData();
        return (int)System.nanoTime() * x;
    }

    public static void main(String[] args) {
        update time;

    }
}
