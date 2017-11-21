package fitbit;

public class Test {

    private static void TestClock () {
        try {
            System.out.println(Clock.time(ClockData.getTimeData()));
            Thread.sleep(1000);
            System.out.println(Clock.time(ClockData.getTimeData()));
            System.out.println(Clock.time(ClockData.getTimeData()));
            System.out.println(Clock.time(ClockData.getTimeData()));
            System.out.println(Clock.time(ClockData.getTimeData()));
        } catch (java.lang.InterruptedException e) {
            System.out.println("Interrupted");
        }
    }

    public static void main(String[] args) {
        TestClock();
    }
}
