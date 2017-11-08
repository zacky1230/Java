package ThinkingInJava.holding;

import ThinkingInJava.typeinfo.pets.Cymric;
import ThinkingInJava.typeinfo.pets.Hamster;
import ThinkingInJava.typeinfo.pets.Pet;
import ThinkingInJava.typeinfo.pets.Pets;

import java.util.List;
import java.util.Random;

import static ThinkingInJava.net.mindview.util.Print.print;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 17:25.
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random random = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        print("1: " + pets);
        Hamster h = new Hamster();
        pets.add(h);
        print("2: " + pets);
        print("3: " + pets.contains(h));
        pets.remove(h);
        Pet p = pets.get(2);
        print("4: " + pets.indexOf(p));
        Pet cymric = new Cymric();
        print("5: " + pets.indexOf(cymric));
        print("6: " + pets.remove(cymric));
        print("7: " + pets.remove(p));

    }
}
