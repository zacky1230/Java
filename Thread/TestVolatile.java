package Thread;

public class TestVolatile implements Runnable {
    volatile boolean stop = false;
    int i = 0;

    @Override
    public void run() {
        while (!stop) {
            doSomething();
        }
    }

    private void setStop(boolean b) {
        this.stop = b;
    }

    private void doSomething() {
        System.out.println(i++);
    }

    public static void main(String[] args) throws InterruptedException {
        TestVolatile testVolatile = new TestVolatile();
        new Thread(testVolatile).start();
        Thread.sleep(1);
        testVolatile.setStop(true);
    }
}
