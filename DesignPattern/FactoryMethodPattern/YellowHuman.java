package DesignPattern.FactoryMethodPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 20:21.
 */
public class YellowHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黄种人会大笑！");
    }

    @Override
    public void cry() {
        System.out.println("黄种人会哭哎");
    }

    @Override
    public void talk() {
        System.out.println("黄种人会说法，都是双音节");
    }
}
