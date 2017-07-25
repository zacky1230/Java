package DesignPattern.BuilderPattern;

import java.util.ArrayList;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 15:40.
 */
public class Client {
    public static void main(String[] args) {
        BMWModel bmwModel = new BMWModel();
        ArrayList<String> sequece = new ArrayList<>();
        sequece.add("engine boom");
        sequece.add("start");
        sequece.add("stop");

        bmwModel.setSequence(sequece);
        bmwModel.run();

        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequece);
        BenzModel benz = (BenzModel)benzBuilder.getCarModel();
        benz.run();

        Director director = new Director();
        for(int i = 0; i < 10000; i++){
            director.getABenzModel().run();
        }
        for(int i = 0; i < 10000; i++){
            director.getBBenzModel().run();
        }
    }
}
