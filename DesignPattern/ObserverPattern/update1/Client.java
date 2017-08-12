package DesignPattern.ObserverPattern.update1;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 15:01.
 */
public class Client {
    public static void main(String[] args) {
        Observer lisi = new Lisi();
        Observer wangsi = new WangSi();

        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.addObserver(wangsi);

        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
