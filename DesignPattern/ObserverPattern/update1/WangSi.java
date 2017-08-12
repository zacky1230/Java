package DesignPattern.ObserverPattern.update1;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 14:57.
 */
public class WangSi implements Observer {

    @Override
    public void update(String context) {
        System.out.println("王思：观察到韩非子活动，自己也开始活动了。。。");
        this.cry(context);
        System.out.println("王思：真真的哭到死了。。。\n");
    }

    private void cry(String context) {
        System.out.println("王思：因为" + context + ",所以我悲伤呀！");
    }
}
