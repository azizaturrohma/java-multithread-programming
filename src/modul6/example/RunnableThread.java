package modul6.example;

public class RunnableThread implements Runnable {
    // Run method is executed when thread first started
    public void run() {
        System.out.println("I am an instance of the java.lang.Runnable interface");
    }

    // Main method to create and start threads
    public static void main(String args[]) {
        System.out.println("Creating runnable object");

        // Create runnable object
        Runnable run = (Runnable) new RunnableThread();

        // Create a thread, and pass the runnable object
        System.out.println("Creating first thread");
        Thread t1 = new Thread(run);

        // Create a second thread, and pass the runnable object
        System.out.println("Creating second thread");
        Thread t2 = new Thread(run);

        // Start both threads
        System.out.println("Starting both threads");
        t1.start();
        t2.start();
    }
}