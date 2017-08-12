package DesignPattern.ObserverPattern.update1;

import java.util.ArrayList;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 14:47.
 */
public class HanFeiZi implements Observable {

    private ArrayList<Observer> observerArrayList = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        this.observerArrayList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observerArrayList.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for(Observer observer : observerArrayList)
            observer.update(context);
    }

    public void haveBreakfast(){
        System.out.println("韩非子：开始吃饭啦。。。");
        this.notifyObservers("韩非子在吃饭");
    }

    public void haveFun(){
        System.out.println("韩非子：开始娱乐了。。。");
        this.notifyObservers("韩非子在娱乐");
    }
}
