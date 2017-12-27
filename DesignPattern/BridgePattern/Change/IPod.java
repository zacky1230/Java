package DesignPattern.BridgePattern.Change;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:48.
 */
public class IPod extends Product {
    @Override
    public void beProducted() {
        System.out.println("生出来的iPod是这样子的");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的ipod卖出去了");
    }
}
