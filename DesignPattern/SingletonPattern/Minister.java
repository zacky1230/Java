package DesignPattern.SingletonPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 13:54.
 */
public class Minister {
    public static void main(String[] args){
        //First day
        Emperor emperor1 = Emperor.getInstance();
        emperor1.emperorInfo();
        //Second day
        Emperor emperor2 = Emperor.getInstance();
        emperor2.emperorInfo();
        //Third day
        Emperor emperor3 = Emperor.getInstance();
        emperor3.emperorInfo();
    }
}
