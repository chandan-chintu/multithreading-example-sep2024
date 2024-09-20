package aftermultithreading;

public class OurNewThread extends Thread {
    OurNewThread() {
        start();// starts the thread
    }

    public void run() {
        try {
            //part2
            for (int j = 0; j <= 10; j++) {
                System.out.println("second part j : " + j);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Exception occured :" + e.getMessage());
        }
    }

}
