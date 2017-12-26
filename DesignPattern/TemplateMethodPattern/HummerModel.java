package DesignPattern.TemplateMethodPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:33.
 */
public abstract class HummerModel {
    public abstract void start();
    public abstract void stop();
    public abstract void alarm();
    public abstract void engineBoom();
    public void run(){
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }
}
