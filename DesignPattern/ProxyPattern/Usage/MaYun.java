package DesignPattern.ProxyPattern.Usage;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:58.
 */
public class MaYun implements ZiRanRen {
    public void eat() {
        System.out.println("在吃饭");
    }

    public void drink() {
        System.out.println("在喝水");
    }

    @Override
    public void Quanli() {
        System.out.println("我赋予代理律师来行使权力，代理律师全权代理我处理某些事物");
    }
}
