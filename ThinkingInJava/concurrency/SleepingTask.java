package ThinkingInJava.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SleepingTask extends LifyOff {
    public void run() {
        try {
            while (countDown-- >0){
                System.out.println(status());
                Thread.sleep(1000);
                //TimeUnit.MILLISECONDS.sleep(100);
            }
        }catch (InterruptedException e){
            System.err.println("Interrupted");
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < 5; i++){
            exec.execute(new SleepingTask());
        }
        exec.shutdown();
    }
}
