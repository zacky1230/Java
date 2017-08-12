package DesignPattern.ObserverPattern.update1;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 14:45.
 */
public interface Observable {
    public void addObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObservers(String context);
}
