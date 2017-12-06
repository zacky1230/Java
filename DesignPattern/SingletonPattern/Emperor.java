package DesignPattern.SingletonPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 21:55.
 */
public class Emperor {
    private static Emperor emperor = null;

    private Emperor() {

    }

    public static Emperor getInstance(){
        if(emperor != null){
            emperor = new Emperor();
        }
        return emperor;
    }

    public static void emperorInfo(){
        System.out.println("我是皇帝某某某");
    }
}
