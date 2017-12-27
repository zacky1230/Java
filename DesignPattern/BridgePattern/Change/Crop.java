package DesignPattern.BridgePattern.Change;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:51.
 */
public abstract class Crop {
    private Product product;

    public Crop(Product product){
        this.product = product;
    }

    public void makeMoney(){
        this.product.beProducted();
        this.product.beSelled();
    }
}
