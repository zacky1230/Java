package ThinkingInJava.concurrency;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:59.
 */
public class LifyOff implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    public LifyOff(){}
    public LifyOff(int countDown){
        this.countDown = countDown;
    }

    public String status(){
        return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + ").";
    }
    @Override
    public void run() {
        while (countDown-- > 0)
            System.out.println(status());
        Thread.yield();
    }
}
