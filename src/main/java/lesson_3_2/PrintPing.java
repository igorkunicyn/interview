package lesson_3_2;

public class PrintPing implements Runnable{
    private final SyncQueue syncQueue;

    public PrintPing(SyncQueue syncQueue) {
        this.syncQueue = syncQueue;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (syncQueue.isEndApp()) {
            syncQueue.printPing();
        }
    }
}
