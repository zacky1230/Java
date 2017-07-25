package DesignPattern.TemplateMethodPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 14:52.
 */
public class HummerH1Model extends HummerModel {
    private  boolean alarmFlag = true;

    @Override
    protected void start() {
        System.out.println("悍马H1发动。。。");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1停止。。。");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1鸣笛。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H1引擎声音。。。");
    }

    @Override
    protected boolean isAlarm(){
        return this.alarmFlag;
    }

    public void setAlarm(boolean isAlarm){
        this.alarmFlag = isAlarm;
    }
}
