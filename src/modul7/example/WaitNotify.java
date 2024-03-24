package modul7.example;

public class WaitNotify extends Thread {

    public static void main(String args[]) throws Exception {
        Thread notificationThread = new WaitNotify();
        notificationThread.start();

        // Wait for the notification thread to trigger event
        synchronized (notificationThread) {
            notificationThread.wait();
        }

        // Notify user that the wait() method has returned
        System.out.println("The wait is over");
    }

    public void run() {
        System.out.println("Hit enter to stop waiting thread");
        try {
            System.in.read();
        } catch (java.io.IOException ioe) {
            System.out.println(ioe);
        }

        // Notify any threads waiting on this thread
        synchronized (this) {
            this.notifyAll();
        }
    }
}