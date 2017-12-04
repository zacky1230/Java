package DesignPattern.StrategyPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 21:33.
 */
public class BackDoor implements IStrategy {
    @Override
    public void opearte() {
        System.out.println("开后门了");
    }
}
