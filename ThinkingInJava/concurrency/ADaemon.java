package ThinkingInJava.concurrency;

public class ADaemon implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Starting ADaemon");
            Thread.sleep(1);
        } catch (InterruptedException e) {

        } finally {
            System.out.println("This should always run?");
        }
    }
}
