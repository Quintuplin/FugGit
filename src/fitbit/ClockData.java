package fitbit;

/**
 * ClockData.java
 * AUTHOR: TEAM HUNGRY
 * CLASS: CSCI 360-01
 * PURPOSE: STORES SETTINGS FOR DATE/TIME, ALARM, AND TIMER
 * OTHER:
 *      1) MAINTAINS THE DATASET
 *      2) MIGHT BE FUSED WITH CLOCK CLASS
 *      3) SIMPLY STORES THESE SETTINGS TO BE USED BY CLOCK CLASS
 */

class ClockData {
    private static int time = 0;

    private static void setTime(int t){
        time = t;
    }

    static int getTime(){
        return time;
    }
}
