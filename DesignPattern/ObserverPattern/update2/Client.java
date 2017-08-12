package DesignPattern.ObserverPattern.update2;

import java.util.Observer;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 15:24.
 */
public class Client {
    public static void main(String[] args) {
        Observer liSi = new LiSi();
        Observer wangSi = new WangSi();

        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);

        hanFeiZi.haveBreakfast();
    }
}
