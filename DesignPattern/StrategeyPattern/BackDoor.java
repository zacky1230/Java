package DesignPattern.StrategeyPattern;

/**
 * Created by zacky on 7/16/17.
 */
public class BackDoor implements IStrategy{
    /**
     *
     */
    @Override
    public void operate() {
        System.out.println("这是后门实现类！");
    }
}
