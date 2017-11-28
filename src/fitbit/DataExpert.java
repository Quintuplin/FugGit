package fitbit;

/**
 * DataExpert.java
 * Team Hungry
 * CSCI 360-01
 * Initializes everything and is a data passthrough for UI layer (DisplayWindow)
 */

public class DataExpert {
    private Clock clock = new Clock();
    private StepsHeartrate stepsHeartrate =  new StepsHeartrate();
    private ActivityCalories activityCalories = new ActivityCalories();
    private UserData userData = new UserData();
    double stopTime = clock.endTimer();

    public void setUserData(int age, int weight, boolean sex){
        userData.setUserData(age, weight, sex);
    }

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

    public String getCalories(){
        return Double.toString(this.activityCalories.getCalories(userData, clock, stepsHeartrate, stopTime));
    }
}
