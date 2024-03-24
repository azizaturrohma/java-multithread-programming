package modul7.example;

public class Counter {
    private int countValue;

    public Counter() {
        countValue = 0;
    }

    public Counter(int start) {
        countValue = start;
    }

    // Synchronized method to increase counter
    public synchronized void increaseCount() {
        int count = countValue;

        // Simulate slow data processing and modification
        try {
            Thread.sleep(5);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
        count = count + 1;
        countValue = count;
    }

    // Synchronized method to return counter value
    public synchronized int getCount() {
        return countValue;
    }
}