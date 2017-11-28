package fitbit;

import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Clock.java
 * AUTHOR: TEAM HUNGRY
 * CLASS: CSCI 360-01
 * PURPOSE: Calculates date and time
 */

class Clock {
    private long timer;
    private String time;
    private String date;

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

    public void startTimer(){
        timer = System.nanoTime();
    }

    public float endTimer(){
        return (float) ((System.nanoTime()- timer) / 1000000000.0);
    }
}