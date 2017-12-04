package DesignPattern.StrategyPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:07.
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void opearte() {
        System.out.println("挡住敌人");
    }
}
