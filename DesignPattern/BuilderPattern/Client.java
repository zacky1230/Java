package DesignPattern.BuilderPattern;

import java.util.ArrayList;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:57.
 */
public class Client {
    public static void main(String[] args) {
        BenzModel benzModel = new BenzModel();
        ArrayList<String> sequence = new ArrayList<>();

        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");

        benzModel.setSequence(sequence);
        benzModel.run();
    }
}
