package ThinkingInJava.initialization;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 10:22.
 */
public class OverloadingVarargs {
    static void f(Character... args){
        System.out.println("first");
        for (Character c : args)
            System.out.print(" " + c);
        System.out.println();
    }

    static void f(Integer... args){
        System.out.println("second");
        for (Integer i : args)
            System.out.print(" " + i);
        System.out.println();
    }

    static void f(Long... args){
        System.out.println("third");
    }

    public static void main(String[] args) {
        f('a', 'b', 'c');
        f(1);
        f(2, 1);
        f(0);
        f(0L);
    }
}
