package fitbit;

/**
 * DisplayUI.java
 * AUTHOR: TEAM HUNGRY
 * CLASS: CSCI 360-01
 * PURPOSE: TO READ FROM DISPLAY READY DATASET
 *      TO DYNAMICALLY DISPLAY THE DATA
 *      TO ENABLE SETTINGS CHANGES
 *  OTHER:
 *      1) CALLS DATAIO ON DISPLAY READY DATASET, DISPLAYS DATA
 *      2) CALLS DATAIO ON SETTINGS DATASET, ALTERS DATA, SUBMITS CHANGES
 *
 *      RDD: CALLS INFORMATION EXPERT
 */
public class DisplayUI {
    static int menu = 0;
    static int menub = 0;
    public static void main(String[] args) {
        //initScreen(); //starts the simulation
        while(true) {
            //dataDisplay(); //displays the currently selected menu
            buttonListen(); //listens for button presses
        }

    }

    public void DisplayUI(){
        menu = 0;
        menub = 0;
    }

    //output data to display
    //Controller Will most likely be passed in as well
    public void dataDisplay(Clock clock, UserData u1, Controller Controller1, UI UI1){
        DataExpert dataExpert1 = new DataExpert();
        StepBPSData STPBPS1 =  new StepBPSData();
        HACData HACData1 = new HACData();

        //Display UI
        UI1.button1();

        int i = 0;
        while(i < 2) {
            if (menu == 0) {
                boolean onScreen = true;
                while (onScreen == true) {
                    if (Controller1.buttonListen() == false) {
                        String time = clock.currentTime();
                        String date = clock.currentDate();
                        System.out.println(time + "|" + date + "\n");
                    } else {
                        onScreen = false;
                        displayChange();
                    }
                }
                //Call Java swing method that displays menu 1 taking in steps time and date as parameters
                //display menu 1: clock
            } else if (menu == 1) {
                boolean onScreen = true;
                while (onScreen == true) {
                    if (Controller1.buttonListen() == false) {
                        int step1 = dataExpert1.getStepData(STPBPS1);
                        int HR = dataExpert1.getHearRate(HACData1);
                        System.out.println("Steps: " + step1);
                        System.out.println("HeartRate: " + HR + "\n");
                        //display Heart rate and steps
                    } else {
                        onScreen = false;
                        displayChange();
                    }
                }
            } else if (menu == 2) {
                float time = 60; // TIME FOR CALORIES
                double cal = dataExpert1.getCaloriesBurned(HACData1, u1, time);
                System.out.println("Calories Burned: " + cal + "\n");
                //Displays Calories burned
            } else if (menu == 3) {
                System.out.println("Menu 3 (Activity Menu(NOT FINISHED)) \n");
                //Will display Activity
            }
            i++;
        }
    }

    //How display is changed
    private void displayChange(){
        menu = ++menu%4;
        menub = 0;
    }

    //listen for button press
    private static void buttonListen(){
        if (true){//button1press
            menu = menu++%4;
            menub = 0;
        }
        if (false){//button2press
            if(false){//button2hold placeholder if statement
                //enter edit mode
            }else{//button2tap
                //alter secondary menu
                menub++;
            }
        }
    }
        //if button press, alter menu

}
