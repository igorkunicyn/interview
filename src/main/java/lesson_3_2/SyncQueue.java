package lesson_3_2;

public class SyncQueue {
    private boolean flag = false;
    private boolean endApp = true;
    private final Counter counter;

    public boolean isEndApp() {
        return endApp;
    }

    public void setEndApp(boolean endApp) {
        this.endApp = endApp;
    }


    public SyncQueue() {
        this.counter = new Counter();
        new PrintPing(this);
        new PrintPong(this);
    }

    public Counter getCounter() {
        return counter;
    }

    public synchronized void printPing(){
        while (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("ping");
        counter.increaseCounter();
        flag = true;
        notify();
    }

    public synchronized void printPong(){
        while (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("pong");
        counter.increaseCounter();
        flag = false;
        notify();
    }

}
