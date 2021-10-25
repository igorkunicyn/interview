package lesson_3_1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private final Lock lock;
    private long counter;

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
