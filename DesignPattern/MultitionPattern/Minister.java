package DesignPattern.MultitionPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 14:32.
 */
@SuppressWarnings("all")
public class Minister {
    public static void main(String[] args) {
        int ministerNum = 10;

        for (int i = 0; i < ministerNum; i++) {
            if (i < 5) {
                Emperor emperor = Emperor.getInstance(1);
                System.out.print("第" + (i + 1) + "个大臣参拜的是：");
                emperor.emperorInfo();
            } else {
                Emperor emperor = Emperor.getInstance();
                System.out.print("第" + (i + 1) + "个大臣参拜的是：");
                emperor.emperorInfo();
            }
        }
    }
}
