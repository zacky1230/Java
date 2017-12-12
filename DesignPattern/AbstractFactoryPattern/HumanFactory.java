package DesignPattern.AbstractFactoryPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 23:23.
 */
public interface HumanFactory {

    public Human createYellowHuman();

    public Human createWhiteHuman();

    public Human createBlackHuman();
}
