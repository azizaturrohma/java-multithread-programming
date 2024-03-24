package modul6.example;

public class ExtendThread extends Thread {
    int threadNumber;

    public ExtendThread(int num) {
        threadNumber = num;
    }

    // Run method is executed when thread first started
    public void run() {
        System.out.println("I'm thread number: " + threadNumber);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            System.out.println(threadNumber + "is finished");
        }

        System.out.println(threadNumber + " is finished!");
    }

    public static void main(String[] args) {
        System.out.println("Creating thread 1");
        Thread t1 = new ExtendThread(1);

        System.out.println("Creating thread 2");
        Thread t2 = new ExtendThread(2);

        // Start both threads
        t1.start();
        t2.start();
    }
}
