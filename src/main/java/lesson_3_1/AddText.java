package lesson_3_1;

public class AddText implements Runnable{
    private final SyncQueue queue;

    public AddText(SyncQueue queue) {
        this.queue = queue;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (queue.isCycle()) {
            addToQueue();
        }
    }

    private void addToQueue(){
        for (int j = 0; j < queue.getStringList().size(); j++) {
            queue.getQueue().add(queue.getStringList().get(j));
        }

    }
}
