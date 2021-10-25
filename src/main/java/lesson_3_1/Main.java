package lesson_3_1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("ping","pong");
        SyncQueue syncQueue = new SyncQueue(stringList);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        syncQueue.setCycle(false);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter= " + syncQueue.getCounter().getCounter());
    }
}
