package DesignPattern.FactoryMethodPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:46.
 */
public class YellowHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黄种人在笑");
    }

    @Override
    public void cry() {
        System.out.println("黄种人会哭");
    }

    @Override
    public void talk() {
        System.out.println("黄种人在讲话");
    }
}
