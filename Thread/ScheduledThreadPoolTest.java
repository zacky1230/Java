package Thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest {
    public static void main(String[] args) {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(10);
        //如果前面的任务还未完成，则调度不会启动。
        ses.scheduleWithFixedDelay((Runnable) () -> {
            try {
                Thread.sleep(1000);
                System.out.println(System.currentTimeMillis() / 1000);
            } catch (Exception e) {
            }
        }, 0, 2, TimeUnit.SECONDS);//启动0秒后执行，然后周期2秒执行一次
    }
}
