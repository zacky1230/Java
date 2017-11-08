package ThinkingInJava.holding;

import java.util.ArrayList;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 10:15.
 */
class Apple{
    private static long counter;
    private final long id = counter++;
    public long id(){
        return id;
    }
}

class Orange{}

public class ApplesAndOrangeWithoutGenerics {
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++){
            apples.add(new Apple());
        }
        apples.add(new Orange());
        for(int i = 0; i < apples.size(); i++){
            ((Apple)apples.get(i)).id();
        }
    }
}
