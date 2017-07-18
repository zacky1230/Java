package DesignPattern.FactoryMethodPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 20:25.
 */
public class WhiteHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("白色人会侵略的笑");
    }

    @Override
    public void cry() {
        System.out.println("白色人会哭");
    }

    @Override
    public void talk() {
        System.out.println("白色人会讲话，一般都是单音节");
    }
}
