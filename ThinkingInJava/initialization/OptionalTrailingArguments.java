package ThinkingInJava.initialization;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 10:05.
 */
public class OptionalTrailingArguments {
    static void f(int required, String... trailing){
        System.out.print("required: " + required + " ");
        for (String s : trailing)
            System.out.print(s + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        f(1, "one");
        f(3, "one", "two");
        f(0);
    }
}
