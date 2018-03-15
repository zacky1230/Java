package ThinkingInJava.concurrency;

public class ThreadVariations {
    public static void main(String[] args) {
        new InnerRunnable1("InnerRunnable1");
        new InnerRunnable2("InnerRunnable2");
        new InnerThread1("InnerThread1");
        new InnerThread2("InnerThread2");
        new ThreadMethod("ThreadMethod").runTask();
    }
}
