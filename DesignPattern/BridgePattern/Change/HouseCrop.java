package DesignPattern.BridgePattern.Change;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:52.
 */
public class HouseCrop extends Crop {
    public HouseCrop(Product product) {
        super(product);
    }

    public void makeMoney(){
        super.makeMoney();
        System.out.println("房地产公司赚大钱");
    }
}
