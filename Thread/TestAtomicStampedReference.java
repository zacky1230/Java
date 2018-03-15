package Thread;

import java.util.concurrent.atomic.AtomicStampedReference;

public class TestAtomicStampedReference {
    private static AtomicStampedReference<Integer> money = new AtomicStampedReference<Integer>(
            19, 0);

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            final int timestamp = money.getStamp();
            new Thread(() -> {
                while (true) {
                    while (true) {
                        Integer m = money.getReference();
                        if (m < 20) {
                            if (money.compareAndSet(m, m + 20, timestamp,
                                    timestamp + 1)) {
                                System.out.println("充值成功，余额:"
                                        + money.getReference());
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }).start();
        }

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                while (true) {
                    int timestamp = money.getStamp();
                    Integer m = money.getReference();
                    if (m > 10) {
                        if (money.compareAndSet(m, m - 10, timestamp,
                                timestamp + 1)) {
                            System.out.println("消费10元，余额:"
                                    + money.getReference());
                            break;
                        }
                    } else {
                        break;
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
            }
        }).start();
    }
}
