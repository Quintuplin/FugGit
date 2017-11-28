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
    private UserData user = new UserData();
    DataExpert dataExpert = new DataExpert();
    StepBPSData stepBPSData =  new StepBPSData();
    HACData hacData = new HACData();

    public String getTime(){
        return this.clock.currentTime();
    }
}
