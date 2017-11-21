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
    private static double time = 24.0;
    private static int date = 0;

    private static void setTimeData(double t){
        t %= 1439; //1440 minutes per day
        time = t;
    }

    private static void setDateData(int d){
        d %= 364; //365 days per year
        date = d;
    }

    static double getTimeData(){
        return time;
    }

    static int getDateData(){
        return date;
    }
}
