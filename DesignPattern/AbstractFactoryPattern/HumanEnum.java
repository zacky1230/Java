package DesignPattern.AbstractFactoryPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 19:47.
 */
public enum HumanEnum {
    YelloMaleHuman("DesignPattern.AbstractFactoryPattern.YellowMaleHuman"),
    YellowFemaleHuman("DesignPattern.AbstractFactoryPattern.YellowFemaleHuman"),
    WhiteMaleHuman("DesignPattern.AbstractFactoryPattern.WhiteMaleHuman"),
    WhiteFemaleHuman("DesignPattern.AbstractFactoryPattern.WhiteFemaleHuman"),
    BlackMaleHuman("DesignPattern.AbstractFactoryPattern.BlackMaleHuman"),
    BlackFemaleHuman("DesignPattern.AbstractFactoryPattern.BlackFemaleHuman");
    private String value = "";
    HumanEnum(String value) {
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
}
