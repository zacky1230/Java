package DesignPattern.BridgePattern.Change;

import DesignPattern.BridgePattern.Change.Product;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 18:18.
 */
public class Clothes extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出的衣服是这样子的");
    }

    @Override
    public void beSelled() {
        System.out.println("生出来的衣服卖出来了");
    }
}
