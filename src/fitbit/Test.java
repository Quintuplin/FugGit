package fitbit;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.awt.*;
import java.time.LocalDateTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Optional;

public class Test {

    private  static void TestHAC() {
        System.out.println("INITIALIZE HAC and User Data");
        DisplayUI display = new DisplayUI();
        Clock c1 = new Clock();
        HAC hac = new HAC();
        StepBPSData BPS1 = new StepBPSData();
        Controller Cont1 = new Controller();
        UserData U1 = new UserData();
        Cont1.initialize(U1);

        //hac.calculateCalories(U1.getAge(), U1.getWeight(), U1.getSex(), BPS1.getBPS(), 60); //60 min is a placeholder as I cant wait an hour to see if it is done

        //System.out.println(hac.getCalories());


    }

    private static void TestDisplayData(){
        System.out.println("INITIALIZE Display Data");
        UserData u1 = new UserData();
        StepBPSData BPS1 = new StepBPSData();
        DisplayUI display = new DisplayUI();
        HACData HAC1 = new HACData();

        Controller Cont1 = new Controller();
        Cont1.initialize(u1);


        Clock c1 = new Clock();
        display.dataDisplay(c1, BPS1, BPS1, HAC1, u1);
        display.displayChange();
        display.dataDisplay(c1, BPS1, BPS1, HAC1, u1);
        display.displayChange();
        display.dataDisplay(c1, BPS1, BPS1, HAC1, u1);
    }

    /*private static void TestClock () {
        try {

            System.out.println("time = 2");
            ClockData.setTimeData(2);
            System.out.println(Clock.time(ClockData.getTimeData()));
            Thread.sleep(1000);
            System.out.println(Clock.time(ClockData.getTimeData()));
            Thread.sleep(1000);
            System.out.println(Clock.time(ClockData.getTimeData()));
            Thread.sleep(1000);
            System.out.println(Clock.time(ClockData.getTimeData()));


            System.out.println("\ntime = 250");
            ClockData.setTimeData(250);
            System.out.println(Clock.time(ClockData.getTimeData()));
            Thread.sleep(1000);
            System.out.println(Clock.time(ClockData.getTimeData()));
            Thread.sleep(1000);
            System.out.println(Clock.time(ClockData.getTimeData()));
            System.out.println("please wait 1 minute for final test");
            Thread.sleep(60000);
            System.out.println(Clock.time(ClockData.getTimeData()));

        } catch (java.lang.InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
*/
    public static void main(String[] args) {

        Clock c1 = new Clock();
        c1.startTimer();
        TestDisplayData();
        TestHAC();
        //TestClock();
        System.out.println(c1.endTimer());
    }
}
