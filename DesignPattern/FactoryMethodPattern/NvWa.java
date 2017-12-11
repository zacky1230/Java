package DesignPattern.FactoryMethodPattern;

import DesignPattern.ProxyPattern.WangPo;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:52.
 */
public class NvWa {
    public static void main(String[] args) {
        System.out.println("---第一批---白人");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.cry();
        whiteHuman.laugh();
        whiteHuman.talk();
        System.out.println("---第二批---黑人");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.talk();
        blackHuman.laugh();
        blackHuman.cry();
        System.out.println("---第三批---黄种人");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.cry();
        yellowHuman.laugh();
        yellowHuman.talk();



        for (int i = 0; i < 1000000; i++) {
            System.out.println("---随机造人---" + i);
            Human human = HumanFactory.creatHuman();
            human.cry();
            human.laugh();
            human.talk();
        }
    }
}
