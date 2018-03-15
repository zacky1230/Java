package Thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class HoseeBlockingQueue {
    private static Integer count = 0;
    final BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(10);
    class Producer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    bq.put(1);
                    count++;
                    System.out.println(Thread.currentThread().getName()
                            + "生产者生产，目前总共有" + count);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    class Consumer implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                try {
                    bq.take();
                    count--;
                    System.out.println(Thread.currentThread().getName()
                            + "消费者消费，目前总共有" + count);
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
        }

    }

    public static void main(String[] args) throws Exception {
        HoseeBlockingQueue hosee = new HoseeBlockingQueue();
        new Thread(hosee.new Producer()).start();
        new Thread(hosee.new Consumer()).start();
        new Thread(hosee.new Producer()).start();
        new Thread(hosee.new Consumer()).start();

        new Thread(hosee.new Producer()).start();
        new Thread(hosee.new Consumer()).start();
        new Thread(hosee.new Producer()).start();
        new Thread(hosee.new Consumer()).start();
    }
}
