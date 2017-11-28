package fitbit;


/**
 * Controller.java
 * AUTHOR: TEAM HUNGRY
 * CLASS: CSCI 360-01
 * PURPOSE: Initializes everything and is a passthrough for UI set/get settings
 */

public class Controller {

    public void Initialize(){
        DisplayWindow displayWindow = new DisplayWindow();
        Clock clock = new Clock();
        UserData user = new UserData();
        Controller controller = new Controller();
        DataExpert dataExpert = new DataExpert();
        StepBPSData stepBPSData =  new StepBPSData();
        HACData hacData = new HACData();

        int age = 49; //Get age from UI PLACEHOLDER FOR NOW
        int weight = 155; //Get weight from UI
        int height = 61; //Get Height from UI
        char sex = 'm'; //Get sex from UI

        //Possibly put the listener into the parameters so we dont have to create extra vars
        user.setUserData(age, weight, height, sex);

        //get userData
        //DataExpert.setUserData(UI.getUserData);

        //get clockData
        //set initial nanotime
        //TEST start generating sensor data
        //initialize Data modules
        //run code

        DisplayWindow.runUI();
    }
}
