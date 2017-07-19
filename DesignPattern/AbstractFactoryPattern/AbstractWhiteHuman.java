package DesignPattern.AbstractFactoryPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 19:36.
 */
public abstract class AbstractWhiteHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("白种人会大声笑");
    }

    @Override
    public void cry() {
        System.out.println("白种人会大声哭");
    }

    @Override
    public void talk() {
        System.out.println("白种人会将单音节语言");
    }

}
