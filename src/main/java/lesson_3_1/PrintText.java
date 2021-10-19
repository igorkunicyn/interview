package lesson_3_1;

public class PrintText implements Runnable{
    private final SyncQueue queue;

    public PrintText(SyncQueue queue) {
        this.queue = queue;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (queue.isCycle() && queue.getQueue().size() > 0) {
            String text = queue.getQueue().poll();
                if (text != null) {
                    System.out.println(text);
                    queue.getCounter().increaseCounter();
                }
        }
    }

}
