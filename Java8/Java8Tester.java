package Java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 11:17.
 */
public class Java8Tester {
    public static void main(String args[]){
        List names = new ArrayList();

        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");

        names.forEach(System.out::println);
    }
}
