public class Timer {

    public static void waitTime(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            System.out.println("Timer error");
        }
    }
}
