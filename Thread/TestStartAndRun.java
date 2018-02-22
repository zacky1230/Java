package Thread;

public class TestStartAndRun {
    public static void main(String[] args) {
        Thread thread1 = new Thread("T1"){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        thread1.start();
        Thread thread2 = new Thread("T2"){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        thread2.run();
    }
}
