package DesignPattern.StrategeyPattern;

/**
 * Created by zacky on 7/16/17.
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("开绿灯！");
    }
}
