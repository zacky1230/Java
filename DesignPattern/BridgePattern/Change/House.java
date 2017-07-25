package DesignPattern.BridgePattern.Change;

import DesignPattern.BridgePattern.Change.Product;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 18:16.
 */
public class House extends Product {

    @Override
    public void beProducted() {
        System.out.println("生产出的房子是这样子的");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的房子卖出了");
    }
}
