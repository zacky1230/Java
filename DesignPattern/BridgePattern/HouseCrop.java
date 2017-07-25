package DesignPattern.BridgePattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 18:03.
 */
public class HouseCrop extends Crop {
    @Override
    protected void produce() {
        System.out.println("房地产公司盖房子");
    }

    @Override
    protected void sell() {
        System.out.println("房地产公司出售房子");
    }

    public void makeMoney(){
        super.makeMoney();
        System.out.println("房地产公司挣钱啦");
    }

}
