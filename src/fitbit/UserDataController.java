package fitbit;


/**
 * UserDataController.java
 * AUTHOR: TEAM HUNGRY
 * CLASS: CSCI 360-01
 * PURPOSE: Initializes everything and is a passthrough for UI set/get settings
 */

public class UserDataController {

    public void initialize(){
        Clock clock = new Clock();
        UserData user = new UserData();
        UserDataController userDataController = new UserDataController();
        //UI UI1 = new UI();
        DataExpert dataExpert = new DataExpert();
        StepBPSData STPBPS =  new StepBPSData();
        HACData HACData1 = new HACData();

        int age = 49; //Get age from UI PLACEHOLDER FOR NOW
        int weight = 155; //Get weight from UI
        int height = 61; //Get Height from UI
        char sex = 'm'; //Get sex from UI

        //Possibly put the listener into the parameters so we dont have to create extra vars
        user.setUserData(age, weight, height, sex);

        //UI1.displayMenu1();
        //display.dataDisplay(clock1, user, controller1, UI1);

        //get userData
        //DataExpert.setUserData(UI.getUserData);


        //get clockData
        //set initial nanotime
        //TEST start generating sensor data
        //initialize Data modules
        //run code
    }
}
