package ThinkingInJava.holding;

import DesignPattern.AdapterPattern.App;

import java.util.ArrayList;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 10:29.
 */
class GrannySimth extends Apple{}
class Gala extends  Apple{}
class Fuji extends Apple{}
public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySimth());
        apples.add(new Gala());
        apples.add(new Fuji());
        for(Apple a : apples){
            System.out.println(a);
        }
    }
}
