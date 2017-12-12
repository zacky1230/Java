package DesignPattern.AbstractFactoryPattern.BlackHuman;

import DesignPattern.AbstractFactoryPattern.Human;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 23:05.
 */
public abstract class AbstractBlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黑人在大笑");
    }

    @Override
    public void cry() {
        System.out.println("黑人在哭泣");
    }

    @Override
    public void talk() {
        System.out.println("黑人在讲话");
    }

}
