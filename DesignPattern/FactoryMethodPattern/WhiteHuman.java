package DesignPattern.FactoryMethodPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:47.
 */
public class WhiteHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("白种人在笑");
    }

    @Override
    public void cry() {
        System.out.println("白种人在哭");
    }

    @Override
    public void talk() {
        System.out.println("白种人在讲话");
    }
}
