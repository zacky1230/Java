package DesignPattern.TemplateMethodPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 14:51.
 */
public abstract class HummerModel {
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();

    final public void run(){
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }

    protected boolean isAlarm(){
        return true;
    }
}
