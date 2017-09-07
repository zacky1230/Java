package ThinkingInJava.initialization;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 10:02.
 */
public class NewVarArgs {
    static void printArray(Object... args){
        for(Object object : args)
            System.out.print(object + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(
                new Integer(47), new Float(3.14), new Double(11.11)
        );
        printArray(new Object[]{
                "one", "two", "three"
        });
        printArray();
    }
}
