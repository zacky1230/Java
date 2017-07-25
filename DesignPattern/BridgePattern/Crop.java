package DesignPattern.BridgePattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 18:01.
 */
public abstract class Crop {
    protected abstract void produce();
    protected abstract void sell();
    public void makeMoney(){
        //先生产
        this.produce();
        //后销售
        this.sell();
    }
}
