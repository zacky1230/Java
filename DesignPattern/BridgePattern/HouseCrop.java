package DesignPattern.BridgePattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:36.
 */
public class HouseCrop extends Crop {
    @Override
    protected void produce() {
        System.out.println("房地产盖房子");
    }

    @Override
    protected void sell() {
        System.out.println("房地产出售房子");
    }

    public void makeMoney(){
        super.makeMoney();
        System.out.println("房地产公司赚大钱了");
    }
}
