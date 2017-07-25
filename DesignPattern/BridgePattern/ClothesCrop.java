package DesignPattern.BridgePattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 18:06.
 */
public class ClothesCrop extends Crop {
    @Override
    protected void produce() {
        System.out.println("服装公司生产衣服");
    }

    @Override
    protected void sell() {
        System.out.println("服装公司出售衣服");
    }

    public void makeMoney(){
        super.makeMoney();
        System.out.println("服装公司赚小钱");
    }
}
