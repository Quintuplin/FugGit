package fitbit;

/**
 * DataExpert.java
 * Team Hungry
 * CSCI 360-01
 * Initializes everything and is a data passthrough for UI layer (DisplayWindow)
 */

public class DataExpert {
    //data expert acts partially as a factory and partially as a controller

    //as a factory, data expert generates an instance of every subclass which will ever be needed
    private Clock clock = new Clock();
    private StepsHeartrate stepsHeartrate =  new StepsHeartrate();
    private ActivityCalories activityCalories = new ActivityCalories();
    private UserData userData = new UserData();
    double stopTime = clock.endTimer();


    //as a data expert, DataExpert accesses data from all subclass instances, and also is responsible for passing whatever instanced data onwards as needed

    //setUserData is an exception, passing set data through from the DisplayWindow where those values are generated
    public void setUserData(int age, int weight, boolean sex){
        userData.setUserData(age, weight, sex);
    }

    //getters make up the "data expert' part of DataExpert
    public String getTime(){
        return this.clock.currentTime();
    }

    public String getDate(){
        return this.clock.currentDate();
    }

    public String getHeartrate(){
        return Integer.toString(this.stepsHeartrate.getBPM());
    }

    public String getSteps(){
        return Integer.toString(this.stepsHeartrate.getSteps());
    }

    public String getActivity(){
        return Float.toString(this.activityCalories.getActivity());
    }

    //getCalories is another special case, passing multiple instances of other subclasses onwards in order for getCalories to have the information it needs
    //the parsing responsibilities are equally able to be here rather than inside ActivityCalories.
    //However, it would make the method call extremely long, as it would have to pass a significantly larger number of fields, so the more compact solution was embraced
    public String getCalories(){
        return Double.toString(this.activityCalories.getCalories(userData, clock, stepsHeartrate, stopTime));
    }
}