package DesignPattern.AbstractFactoryPattern.WhiteHuman;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 23:10.
 */
public class WhiteMaleHuman extends AbstractWhiteHuman {
    @Override
    public void sex() {
        System.out.println("该白种人的性别为男");
    }
}
