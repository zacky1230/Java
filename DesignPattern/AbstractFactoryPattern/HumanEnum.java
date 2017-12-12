package DesignPattern.AbstractFactoryPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 23:16.
 */
public enum HumanEnum {
    //把世界上所有类型都定义出来

    YellowMaleHuman("DesignPattern.AbstractFactoryPattern.YellowHuman.YellowMaleHuman"),
    YellowFemaleHuman("DesignPattern.AbstractFactoryPattern.YellowHuman.YellowFemaleHuman"),
    WhiteMaleHuman("DesignPattern.AbstractFactoryPattern.WhiteHuman.WhiteMaleHuman"),
    WhiteFemaleHuman("DesignPattern.AbstractFactoryPattern.WhiteHuman.WhiteFemaleHuman"),
    BlackMaleHuman("DesignPattern.AbstractFactoryPattern.BlackHuman.BlackMaleHuman"),
    BlackFemaleHuman("DesignPattern.AbstractFactoryPattern.BlackHuman.BlackFemaleHuman");

    private String value;

    HumanEnum(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
