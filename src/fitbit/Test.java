package fitbit;

public class Test {

    private static void TestUI(){
        DisplayWindow.runUI();
    }

    private static void TestHAC() {
        System.out.println("INITIALIZE HAC and User Data");
        Clock c1 = new Clock();
        StepBPSData BPS1 = new StepBPSData();
        //UserDataController Cont1 = new UserDataController();
        //Cont1.initialize();

        //hac.calculateCalories(U1.getAge(), U1.getWeight(), U1.getSex(), BPS1.getBPS(), 60); //60 min is a placeholder as I cant wait an hour to see if it is done

        //System.out.println(hac.getCalories());


    }

    private static void TestDisplayData(){
        System.out.println("INITIALIZE Display Data");
        UserData u1 = new UserData();

       // UserDataController Cont1 = new UserDataController();
        //Cont1.initialize();


        /*Clock c1 = new Clock();
        display.dataDisplay(c1, u1, Cont1);
        display.displayChange();
        display.dataDisplay(c1, u1, Cont1);
        display.displayChange();
        display.dataDisplay(c1, u1, Cont1);
        display.displayChange();
        display.dataDisplay(c1, u1, Cont1);
        display.displayChange();
        display.dataDisplay(c1, u1, Cont1);
    */
    }

    public static void main(String[] args) {
        //test Clock
//        Clock c1 = new Clock();
//        c1.startTimer();
//        TestDisplayData();
//        TestHAC();
//        //TestClock();
//        System.out.println(c1.endTimer());
//
//        //test UI
//        System.out.println("testing UI");
//        TestUI();
        Test test = new Test();
        test.Initialize();
    }

    public void Initialize(){


        int age = 49; //Get age from UI PLACEHOLDER FOR NOW
        int weight = 155; //Get weight from UI
        int height = 61; //Get Height from UI
        char sex = 'm'; //Get sex from UI

        //Possibly put the listener into the parameters so we dont have to create extra vars
        //user.setUserData(age, weight, height, sex);

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
