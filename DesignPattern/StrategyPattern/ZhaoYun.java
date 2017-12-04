package DesignPattern.StrategyPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:10.
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;

        System.out.println("---刚到吴国---");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println();

        System.out.println("---乐不思蜀---");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println();

        System.out.println("---有追兵啦---");
        context = new Context(new BlockEnemy());
        context.operate();
    }
}
