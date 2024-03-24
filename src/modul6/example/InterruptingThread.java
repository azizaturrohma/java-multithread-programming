package modul6.example;

public class InterruptingThread extends Thread {

    // Run method is executed when thread first started
    public void run() {
        System.out.println("I feel sleepy. Wake me in eight hours");

        try {
            // Sleep for eight hours
            Thread.sleep(1000 * 60 * 60 * 8);
            System.out.println("That was a nice nap");
        } catch (InterruptedException e) {
            System.err.println("Just five more minutes....");
        }
    }

    public static void main(String args[]) throws java.io.IOException {
        // Create a 'sleepy' thread
        Thread sleepy = new InterruptingThread();

        // Start thread sleeping
        sleepy.start();

        // Prompt user and wait for input
        System.out.println("Press enter to interrupt the thread");
        System.in.read();

        // InterruptingThread the thread
        sleepy.interrupt();
    }
}