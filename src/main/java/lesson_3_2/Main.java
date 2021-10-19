package lesson_3_2;

public class Main {

    public static void main(String[] args) {
        SyncQueue syncQueue = new SyncQueue();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        syncQueue.setEndApp(false);
        System.out.println("Counter = " + syncQueue.getCounter().getCounter());
    }
}
