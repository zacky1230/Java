package DesignPattern.ProxyPattern;

/**
 * Created by zacky on 10:28.
 */
public class PanJinLian implements KindWomen {
    @Override
    public void makeEyesWithMan() {
        System.out.println("PanJinLian makes eyes with man!");
    }

    @Override
    public void happyWithMan() {
        System.out.println("PanJinLian is happy with man!");
    }
}
