package DesignPattern.ObserverPattern.update;

import DesignPattern.ObserverPattern.IHanFeiZi;
import DesignPattern.ObserverPattern.ILiSi;
import DesignPattern.ObserverPattern.LiSi;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 14:39.
 */
public class HanFeiZi implements IHanFeiZi{
    private ILiSi liSi = new LiSi();

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了。。。");
        this.liSi.update("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了。。。");
        this.liSi.update("韩非子在娱乐");
    }
}
