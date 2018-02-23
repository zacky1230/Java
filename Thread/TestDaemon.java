package Thread;

public class TestDaemon {
    public static class DaemonThread extends Thread
    {
        @Override
        public void run()
        {
            for (int i = 0; i < 10000000; i++)
            {
                System.out.println("hi");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        DaemonThread dt = new DaemonThread();
        //dt.setDaemon(true);设置为守护线程
        dt.start();
    }
}
