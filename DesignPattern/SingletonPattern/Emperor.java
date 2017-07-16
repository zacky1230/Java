package DesignPattern.SingletonPattern;

/**
 * Created by zacky on 13:50.
 */
@SuppressWarnings("all")
public class Emperor {
    private static Emperor emperor = null;//定义皇帝

    private Emperor(){} //唯一性

    public static Emperor getInstance(){
        if(emperor == null){
            emperor = new Emperor();
        }
        return emperor;
    }

    public static void emperorInfo(){
        System.out.println("我就是皇帝XXX");
    }
}
