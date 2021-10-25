package lesson_3_2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private final Lock lock;
    private int counter;

    public Counter(){
        lock = new ReentrantLock();
    }

    public void increaseCounter(){
        lock.lock();
        counter++;
        lock.unlock();
    }

    public long getCounter() {
        return counter;
    }
}
