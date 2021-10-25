package lesson_3_2;

public class PrintPong implements Runnable{
    private final SyncQueue syncQueue;

    public PrintPong(SyncQueue syncQueue) {
        this.syncQueue = syncQueue;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (syncQueue.isEndApp()) {
            syncQueue.printPong();
        }
    }

}
