package DesignPattern.FactoryMethodPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 20:46.
 */
public class NvWa {
    public static void main(String[] args) {
        System.out.println("--------造出第一批人是这样的， 白人------");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.cry();
        whiteHuman.laugh();
        whiteHuman.talk();

        System.out.println("--------造出第二批人是这样的，黑人--------");

        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.cry();
        blackHuman.laugh();
        blackHuman.talk();

        System.out.println("--------造出第三批人是这样的，黄人-------");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.cry();
        yellowHuman.laugh();
        yellowHuman.talk();

        for(int i=0; i < 1000000; i++){
            System.out.println("\n\n-------随机产生人类-----"+i);
            Human human = HumanFactory.createHuman();
            human.cry();
            human.laugh();
            human.cry();
        }
    }
}
