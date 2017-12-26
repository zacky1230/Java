package DesignPattern.BuilderPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:54.
 */
public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("benz start");
    }

    @Override
    protected void stop() {
        System.out.println("benz stop");
    }

    @Override
    protected void alarm() {
        System.out.println("benz alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("benz engine boom");
    }
}
