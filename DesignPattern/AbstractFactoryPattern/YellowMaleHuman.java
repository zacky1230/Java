package DesignPattern.AbstractFactoryPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 19:40.
 */
public class YellowMaleHuman extends AbstractYellowHuman {
    @Override
    public void sex() {
        System.out.println("该黄种人性别为男");
    }
}
