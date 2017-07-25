package DesignPattern.BridgePattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 18:11.
 */
public class IPodCrop extends Crop {
    @Override
    protected void produce() {
        System.out.println("我生产iPod。。。");
    }

    @Override
    protected void sell() {
        System.out.println("iPod畅销");
    }

    public void makeMoney(){
        super.makeMoney();
        System.out.println("我赚钱啦");
    }
}
