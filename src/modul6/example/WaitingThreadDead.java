package modul6.example;

public class WaitingThreadDead extends Thread {
    // Run method is executed when thread first started
    public void run() {
        System.out.println("This thread feels a little ill....");

        // Sleep for five seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }

    public static void main(String args[]) throws java.lang.InterruptedException {
        // Create and start dying thread
        Thread dying = new WaitingThreadDead();
        dying.start();

        // Prompt user and wait for input
        System.out.println("Waiting for thread death");

        // Wait till death
        dying.join();
        System.out.println("Thread has died");
    }
}