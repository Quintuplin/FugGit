package fitbit;

import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Clock.java
 * Team Hungry
 * CSCI 360-01
 * Calculates date and time
 */

class Clock {
    private double timer;
    private String time;
    private String date;
    private String Alarm;

    public Clock(){
        startTimer();
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
        timer = Double.parseDouble(this.currentTime().substring(0,2))
                + Double.parseDouble(this.currentTime().substring(3,5)) / 60
                + Double.parseDouble(this.currentTime().substring(6,8)) / (60 * 60);
    }

    public double endTimer(){
        return timer;
    }

    public void setAlarm(String alarm){
        Alarm = alarm;
    }

    public boolean Alarm(){
        if(Alarm.equals(currentTime())){
            return true;
        }
        return false;
    }
}