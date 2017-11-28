package fitbit;


/**
 * Controller.java
 * AUTHOR: TEAM HUNGRY
 * CLASS: CSCI 360-01
 * PURPOSE: Initializes everything and is a passthrough for UI set/get settings
 */

public class Controller {

    //DisplayWindow displayWindow = new DisplayWindow();
    private Clock clock = new Clock();
    //private UserData user = new UserData();
    //DataExpert dataExpert = new DataExpert();
    StepBPSData stepBPSData =  new StepBPSData();
    HACData hacData = new HACData();

    public String getTime(){
        return this.clock.currentTime();
    }

    public String getDate(){
        return this.clock.currentDate();
    }

    public String getHeartrate(){
        return Integer.toString(this.hacData.getHeartRate());
    }

    public String getSteps(){
        return Integer.toString(this.stepBPSData.getSteps());
    }

    public String getActivity(){
        return Float.toString(this.hacData.getActivity());
    }

    public String getCalories(){
        return Double.toString(this.hacData.getCalories());
    }
}
