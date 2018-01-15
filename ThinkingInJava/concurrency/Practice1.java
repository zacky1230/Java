package ThinkingInJava.concurrency;

public class Practice1 implements Runnable {
    private String startMsg;
    private String endMsg;

    public Practice1(String startMsg, String endMsg) {
        super();
        this.startMsg = startMsg;
        this.endMsg = endMsg;
    }

    @Override
    public void run() {
        System.out.println(this + startMsg + " start");
        for (int i = 0; i < 3; i++) {
            System.out.println("run " + i);
            Thread.yield();
        }
        System.out.println(this + endMsg + " end");
    }


    public String getStartMsg() {
        return startMsg;
    }

    public void setStartMsg(String startMsg) {
        this.startMsg = startMsg;
    }

    public String getEndMsg() {
        return endMsg;
    }

    public void setEndMsg(String endMsg) {
        this.endMsg = endMsg;
    }


    public static void main(String[] args) {

        Practice1 demo = new Practice1("a", "b");

        Thread thread1 = new Thread(demo);

        thread1.start();

        Thread thread2 = new Thread(demo);

        thread2.start();

        Thread thread3 = new Thread(demo);

        thread3.start();
    }
}
