package ThinkingInJava.concurrency;

public class SimpleDaemons implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        }catch (InterruptedException e){
            System.out.println("sleep() interrupted");
        }
    }

    public static void main(String[] args) throws Exception{
        for (int i = 0; i < 10; i++){
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.println("All daemons started");
        Thread.sleep(60000);
    }
}
