package DesignPattern.SingletonPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:22.
 */
public class Minister {
    public static void main(String[] args) {
        Emperor emperor1 = Emperor.getInstance();
        emperor1.emperorInfo();

        Emperor emperor2 = Emperor.getInstance();
        Emperor.emperorInfo();

        emperor2.emperorInfo();
    }
}
