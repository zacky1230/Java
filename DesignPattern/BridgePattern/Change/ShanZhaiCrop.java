package DesignPattern.BridgePattern.Change;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 18:34.
 */
public class ShanZhaiCrop extends Crop {
    public ShanZhaiCrop(Product product) {
        super(product);
    }
    public void makeMoney(){
        super.makeMoney();
        System.out.println("我赚钱啦。。。");
    }
}
