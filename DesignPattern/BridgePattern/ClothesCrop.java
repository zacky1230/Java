package DesignPattern.BridgePattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:39.
 */
public class ClothesCrop extends Crop {
    @Override
    protected void produce() {
        System.out.println("服装厂生产衣服");
    }

    @Override
    protected void sell() {
        System.out.println("服装厂出售衣服");
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装厂赚小钱");
    }
}
