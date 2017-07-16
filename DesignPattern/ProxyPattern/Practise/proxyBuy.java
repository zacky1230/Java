package DesignPattern.ProxyPattern.Practise;

/**
 * Created by zacky on 12:52.
 */
public class proxyBuy implements buyCar {
    private people people;

    public people getPeople() {
        return people;
    }

    public void setPeople(DesignPattern.ProxyPattern.Practise.people people) {
        this.people = people;
    }

    @Override
    public void buyCar() {
        if (people.isVip()) {
            people.buyCar();
            return;
        }
        if (people.getCash() >= 50000) {
            System.out.println(people.getUserName() + " bought a car!");
        } else {
            System.out.println(people.getUserName() + " have not enough money!");
        }
    }

}
