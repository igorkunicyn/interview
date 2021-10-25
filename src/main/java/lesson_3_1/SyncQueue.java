package lesson_3_1;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class SyncQueue {
    private final Queue<String> queue;
    private volatile boolean cycle = true;
    private final List<String> stringList;
    private final Counter counter;


    public SyncQueue(List<String> stringList) {
        queue = new ConcurrentLinkedDeque<>();
        this.stringList = stringList;
        this.counter = new Counter();
        new AddText(this);
        new PrintText(this);
    }


    public Counter getCounter() {
        return counter;
    }


    public Queue<String> getQueue() {
        return queue;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public boolean isCycle() {
        return cycle;
    }

    public void setCycle(boolean cycle) {
        this.cycle = cycle;
    }



}
