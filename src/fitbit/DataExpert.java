package fitbit;

/**
 * DataExpert.java
 * Team Hungry
 * CSCI 360-01
 * Initializes everything and is a data passthrough for UI layer (DisplayWindow)
 */

public class DataExpert {
    //data expert acts partially as a creator and partially as a controller, but primarily as an expert
    //as a creator, data expert generates an instance of every subclass which will ever be needed, and keeps track of them
    private Clock clock = new Clock();
    private StepsHeartrate stepsHeartrate =  new StepsHeartrate();
    private ActivityCalories activityCalories = new ActivityCalories();
    private UserData userData = new UserData();
    private double stopTime = clock.endTimer();

    //as a data expert, DataExpert accesses data from all subclass instances, and also is responsible for passing whatever instanced data onwards as needed
    //these setters pass set data through from the DisplayWindow where those values are needed
    public void setUserData(int age, int weight, boolean sex){ userData.setUserData(age, weight, sex); }
    public void setAlarm(String alarm){ this.clock.setAlarm(alarm); }

    //getters make up the "data expert' part of DataExpert
    public String getTime(){ return this.clock.currentTime(); }
    public String getDate(){ return this.clock.currentDate(); }
    public Boolean getAlarm(){ return this.clock.getAlarm(); }
    public String getHeartrate(){ return Integer.toString(this.stepsHeartrate.getBPM()); }
    public String getSteps(){ return Integer.toString(this.stepsHeartrate.getSteps()); }
    public String getActivity(){ return Float.toString(this.activityCalories.getActivity()); }

    //getCalories is a special case, passing multiple instances of other subclasses onwards in order for getCalories to have the information it needs
    //the parsing responsibilities are equally able to be here rather than inside ActivityCalories.
    //However, it would make the method call extremely long, as it would have to pass a significantly larger number of fields, so the more compact solution was embraced
    public String getCalories(){ return Double.toString(this.activityCalories.getCalories(userData, clock, stepsHeartrate, stopTime)); }

    //reset provides a handy dandy way to handle global and daily resets
    public void reset(){
        clock.startTimer();
        activityCalories.reset();
        stepsHeartrate.reset();
    }
}