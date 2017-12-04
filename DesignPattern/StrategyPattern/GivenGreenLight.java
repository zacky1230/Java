package DesignPattern.StrategyPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:06.
 */
public class GivenGreenLight implements IStrategy{

    @Override
    public void opearte() {
        System.out.println("开绿灯了");
    }
}
