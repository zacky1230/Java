package DesignPattern.AbstractFactoryPattern.YellowHuman;

import DesignPattern.AbstractFactoryPattern.Human;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 23:01.
 */
public abstract class AbstractYellowHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黄种人在笑");
    }

    @Override
    public void cry() {
        System.out.println("黄种人在哭");
    }

    @Override
    public void talk() {
        System.out.println("黄种人讲话");
    }

}
