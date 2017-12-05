package DesignPattern.ProxyPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:54.
 * 另外一个女人
 */
public class JiaShi implements KindWomen {
    @Override
    public void makeEyesWithMan() {
        System.out.println("贾氏正在happy中。。。");
    }

    @Override
    public void happyWithMan() {
        System.out.println("贾氏抛媚眼");
    }
}
