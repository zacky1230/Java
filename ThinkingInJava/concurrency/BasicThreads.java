package ThinkingInJava.concurrency;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 23:10.
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LifyOff());
        t.start();
        System.out.println("waiting for LiftOff");
    }
}
