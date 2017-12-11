package DesignPattern.FactoryMethodPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:48.
 */
public class BlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黑人在笑");
    }

    @Override
    public void cry() {
        System.out.println("黑人在哭");
    }

    @Override
    public void talk() {
        System.out.println("黑人在讲话");
    }
}
