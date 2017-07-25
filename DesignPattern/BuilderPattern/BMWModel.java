package DesignPattern.BuilderPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 15:38.
 */
public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马启动");
    }

    @Override
    protected void stop() {
        System.out.println("宝马停止");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马引擎");
    }
}
