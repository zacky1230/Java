package DesignPattern.AbstractFactoryPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 19:46.
 */
public class BlackFemaleHuman extends AbstractBlackHuman {
    @Override
    public void sex() {
        System.out.println("该黑人的性别为女");
    }
}
