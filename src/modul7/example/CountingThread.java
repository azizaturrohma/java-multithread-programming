package modul7.example;

public class CountingThread implements Runnable {
    Counter myCounter;
    int countAmount;

    // Construct a counting thread to use the specified counter
    public CountingThread(Counter counter, int amount) {
        myCounter = counter;
        countAmount = amount;
    }

    public void run() {
        // Increase the counter the specified number of times
        for (int i = 1; i <= countAmount; i++) {
            // Increase the counter
            myCounter.increaseCount();
            System.out.println(" " + myCounter.getCount());
        }
    }

    public static void main(String args[]) throws Exception {
        // Create a new, thread-safe counter
        Counter c = new Counter();

        // Our runnable instance will increase the counter
        // ten times, for each thread that runs it
        Runnable runner = new CountingThread(c, 10);
        System.out.println("Starting counting threads");
        Thread t1 = new Thread(runner);
        Thread t2 = new Thread(runner);
        Thread t3 = new Thread(runner);
        t1.start();
        t2.start();
        t3.start();

        // Wait for all three threads to finish
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Counter value is " + c.getCount());
    }
}