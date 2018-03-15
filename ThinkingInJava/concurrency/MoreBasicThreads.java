package ThinkingInJava.concurrency;

public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            new Thread(new LifyOff()).start();
        System.out.println("Waiting for LiftOff");
    }
}
