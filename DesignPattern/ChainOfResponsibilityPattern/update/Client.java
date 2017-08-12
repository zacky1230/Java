package DesignPattern.ChainOfResponsibilityPattern.update;

import DesignPattern.ChainOfResponsibilityPattern.*;
import DesignPattern.ChainOfResponsibilityPattern.Women;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 16:06.
 */
public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            arrayList.add(new Women(random.nextInt(4),"我要出去逛街"));
        }

    }
}
