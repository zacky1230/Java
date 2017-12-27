package DesignPattern.BridgePattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:23.
 */
public abstract class Crop {
    protected abstract void produce();

    protected abstract void sell();

    public void makeMoney() {
        this.produce();
        this.sell();
    }
}
