package DesignPattern.BridgePattern.Change;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:46.
 */
public class House extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出的房子应该是这样子的");
    }

    @Override
    public void beSelled() {
        System.out.println("生出来的房子卖出去了");
    }
}
