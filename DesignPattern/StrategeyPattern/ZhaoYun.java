package DesignPattern.StrategeyPattern;

/**
 * Created by zacky on 10:24.
 */
public class ZhaoYun {
    public static void main(String args[]) {
        Context context;

        System.out.println("-------使用第一个计谋------");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("-------使用第二个计谋------");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("-------使用第三个计谋------");
        context = new Context(new BlockEnemy());
        context.operate();
    }
}
