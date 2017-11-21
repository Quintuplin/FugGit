package fitbit;

public class Test {

    private static void TestClock () {
        try {
            System.out.println(Clock.time());
            Thread.sleep(1000);
            System.out.println(Clock.time());
            System.out.println(Clock.time());
            System.out.println(Clock.time());
            System.out.println(Clock.time());
        } catch (java.lang.InterruptedException e) {
            System.out.println("Interrupted");
        }
    }

    public static void main(String[] args) {
        TestClock();
    }
}
