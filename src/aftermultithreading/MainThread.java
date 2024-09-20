package aftermultithreading;

public class MainThread {
    public static void main(String[] args) {

        OurNewThread ourNewThread = new OurNewThread();
        try {
            // part1
            for (int i = 0; i <= 10; i++) {
                System.out.println("first part i : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Exception occured :" + e.getMessage());
        }
    }
}
