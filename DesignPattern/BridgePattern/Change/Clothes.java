package DesignPattern.BridgePattern.Change;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:47.
 */
public class Clothes extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出来的衣服应该是这样子的");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出来的衣服被卖出去了");
    }
}
