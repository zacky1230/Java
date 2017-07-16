package DesignPattern.StrategeyPattern;

/**
 * Created by zacky on 7/16/17.
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("阻挡追兵！");
    }
}
