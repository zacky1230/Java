package DesignPattern.AbstractFactoryPattern.YellowHuman;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 23:08.
 */
public class YellowMaleHuman extends AbstractYellowHuman {
    @Override
    public void sex() {
        System.out.println("该黄种人的性别为男");
    }
}
