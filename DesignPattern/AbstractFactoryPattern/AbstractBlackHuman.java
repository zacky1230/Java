package DesignPattern.AbstractFactoryPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 19:38.
 */
public abstract class AbstractBlackHuman implements Human{
    @Override
    public void laugh() {
        System.out.println("黑人会大笑");
    }

    @Override
    public void cry() {
        System.out.println("黑人会大哭");
    }

    @Override
    public void talk() {
        System.out.println("黑人会大声讲话");
    }

}
