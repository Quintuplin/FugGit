package fitbit;

//java util is a magic clock master
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
    //handy dandy instance vars
    private double timer;
    private String time;
    private String date;
    private String atime;
    private DateFormat df = new SimpleDateFormat("dd/MM/yy");
    private DateFormat tf = new SimpleDateFormat("HH:mm:ss");

    //instantiate and initialize
    public Clock(){
        //used to correctly start calories tracker
        startTimer();

        //this string format causes complications later, but at least it's pretty
        Calendar calobj = Calendar.getInstance();
        date = df.format((calobj.getTime()));
        time = tf.format((calobj.getTime()));
    }

    //called continuously
    private void update(){
        Calendar calobj = Calendar.getInstance();
        date = df.format((calobj.getTime()));
        time = tf.format((calobj.getTime()));
    }

    //useful getters
    public String currentTime(){
        update();
        return time;
    }
    public String currentDate(){
        update();
        return date;
    }

    //used to provide a calculation frame of reference of when the program was last started/reset
    //necessary for calories calculation to be based off of start time and not actual hour
    public void startTimer(){
        timer = Double.parseDouble(this.currentTime().substring(0,2))
                + Double.parseDouble(this.currentTime().substring(3,5)) / 60
                + Double.parseDouble(this.currentTime().substring(6,8)) / (60 * 60);
    }

    //get that frame of reference value
    public double endTimer(){
        return timer;
    }

    //set alarm
    public void setAlarm(String alarm){
        atime = alarm;
    }

    //check if alarm conditions have been met
    public boolean getAlarm() {
        return (atime.equals(currentTime()));
    }
}