package DesignPattern.ObserverPattern.update2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 15:17.
 */
public class WangSi implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("王思：观察到韩非子活动，自己也开始活动了。。。");
        this.cry(arg.toString());
    }

    private void cry(String s) {
        System.out.printf("王思：因为" + s + ",所以我悲伤呀！");
    }
}
