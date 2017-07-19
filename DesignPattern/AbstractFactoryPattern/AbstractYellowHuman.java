package DesignPattern.AbstractFactoryPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 19:33.
 */
public abstract class AbstractYellowHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黄种人在大笑");
    }

    @Override
    public void cry() {
        System.out.println("黄种人在哭！");
    }

    @Override
    public void talk() {
        System.out.println("黄种人将双音节语言");
    }

}
