package ThinkingInJava.initialization;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 10:09.
 */
public class VarargType {
    static void f(Character... args){
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }
    static void g(int... args){
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }

    public static void main(String[] args) {
        f('a','b');
        f();
        g(1);
        g();
        System.out.println("double[]" + new float[1].getClass());
    }
}
