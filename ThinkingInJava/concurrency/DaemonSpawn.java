package ThinkingInJava.concurrency;

public class DaemonSpawn implements Runnable {
    @Override
    public void run() {
        while (true)
            Thread.yield();
    }
}
