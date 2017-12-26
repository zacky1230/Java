package DesignPattern.BuilderPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:56.
 */
public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("BMW start");
    }

    @Override
    protected void stop() {
        System.out.println("BMW stop");
    }

    @Override
    protected void alarm() {
        System.out.println("BMW alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("BMW engine boom");
    }
}
