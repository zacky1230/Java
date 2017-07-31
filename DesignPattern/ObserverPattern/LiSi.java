package DesignPattern.ObserverPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 21:50.
 */
public class LiSi implements ILiSi {
    @Override
    public void update(String context) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报了。。。");
        this.reportToQiShiHuang(context);
        System.out.println("李斯：汇报完毕，秦老板赏给他两个萝卜吃吃。。。\n");
    }
    private void reportToQiShiHuang(String reportContext){
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->" + reportContext);
    }
}
