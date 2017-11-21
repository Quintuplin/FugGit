package fitbit;

public class Test {

    private static void TestClock () {
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

    public static void main(String[] args) {
        Controller.initialize();
        TestClock();
    }
}
