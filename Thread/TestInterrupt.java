package Thread;

public class TestInterrupt {
    public static void main(String[] args) {
        Thread thread = new Thread("T1"){
            @Override
            public void run() {
                while (true){
                    if(Thread.currentThread().isInterrupted())
                    {
                        System.out.println("Interruted!");
                        break;
                    }
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("Interruted When Sleep");
                        //设置中断状态，抛出异常后会清除中断标记位
                        Thread.currentThread().interrupt();
                    }
                    Thread.yield();
                }
            }
        };
        System.out.println(thread.isInterrupted());
        thread.interrupt();
        System.out.println(thread.isInterrupted());
    }
}
