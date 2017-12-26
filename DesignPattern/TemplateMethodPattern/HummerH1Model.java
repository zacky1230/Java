package DesignPattern.TemplateMethodPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:36.
 */
public class HummerH1Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎声音是这样在...");
    }

   /* @Override
    public void run() {
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }*/
}
