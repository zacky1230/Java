package DesignPattern.BridgePattern.Change;

import DesignPattern.BridgePattern.Change.Product;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 18:20.
 */
public class Ipod extends Product {

    @Override
    public void beProducted() {
        System.out.println("生产出的iPod是这个样子的");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的iPod卖出去了");
    }
}
