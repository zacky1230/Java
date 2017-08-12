package DesignPattern.ObserverPattern.update2;

import java.util.Observable;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 15:06.
 */
public class HanFeiZi extends Observable {
    public void haveBreakfast(){
        System.out.println("韩非子：开始吃饭了。。。");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    public void haveFun(){
        System.out.println("韩非子：开始娱乐了。。。");
        super.setChanged();
        this.notifyObservers("韩非子在娱乐");
    }
}
