package DesignPattern.ProxyPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:48.
 * 定义一个潘金莲是什么样的人
 */
public class PanJinLian implements KindWomen {
    @Override
    public void makeEyesWithMan() {
        System.out.println("潘金莲抛媚眼");
    }

    @Override
    public void happyWithMan() {
        System.out.println("潘金莲和男人");
    }
}
