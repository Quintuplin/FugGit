package fitbit;

import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

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


//Cant use Nanotime as a way of keeping track on a clock.


class Clock {
    private long timer;
    private String time;
    private String date;

    //ISSUES
    //UNCHECKED USE OF STATIC
    //MINUTES COUNTER IS ITERATING INCORRECTLY

    public Clock(){
        DateFormat df = new SimpleDateFormat("dd/MM/yy");
        DateFormat tf = new SimpleDateFormat("HH:mm:ss");
        Calendar calobj = Calendar.getInstance();
        date = df.format((calobj.getTime()));
        time = tf.format((calobj.getTime()));
    }

    private void update(){
        DateFormat df = new SimpleDateFormat("dd/MM/yy");
        DateFormat tf = new SimpleDateFormat("HH:mm:ss");
        Calendar calobj = Calendar.getInstance();
        date = df.format((calobj.getTime()));
        time = tf.format((calobj.getTime()));
    }

    public String currentTime(){
        update();
        return time;
    }
    public String currentDate(){
        update();
        return date;
    }

    private static float newMinute;

    public static void init(){
        newMinute = System.nanoTime()/(long)1000000000.0;
    }

    /*static double time(long minutes) {
        float seconds = System.nanoTime()/(long)1000000000.0 - newMinute;
        if(seconds - 60 <= newMinute){
            return minutes + seconds/100 ;
        }
        else {
            init();
            return ++minutes + seconds/100;
        }
    }
*/


    public void startTimer(){
        timer = System.nanoTime();
    }


    public float endTimer(){
        return (float) ((System.nanoTime()- timer) / 1000000000.0);
    }
}