package DesignPattern.AbstractFactoryPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 19:42.
 */
public class YellowFemaleHuman extends AbstractYellowHuman{

    @Override
    public void sex() {
        System.out.println("该黄种人的性别为女");
    }
}
