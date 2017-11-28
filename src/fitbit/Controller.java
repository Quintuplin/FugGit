package fitbit;


/**
 * Controller.java
 * AUTHOR: TEAM HUNGRY
 * CLASS: CSCI 360-01
 * PURPOSE: Initializes everything and is a passthrough to UI
 */

public class Controller {

    //private UserData user = new UserData();
    //DataExpert dataExpert = new DataExpert();
    private Clock clock = new Clock();
    private StepsHeartrate stepsHeartrate =  new StepsHeartrate();
    private HACData hacData = new HACData();

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
        return Float.toString(this.hacData.getActivity());
    }

    public String getCalories(){
        return Double.toString(this.hacData.getCalories());
    }
}
