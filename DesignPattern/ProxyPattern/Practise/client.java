package DesignPattern.ProxyPattern.Practise;

/**
 * Created by zacky on 13:08.
 */
public class client {
    public static void main(String[] args) {
        people people1 = new people();
        people1.setCash(60000);
        people1.setUserName("xiaozhang");

        people people2 = new people();
        people2.setCash(40000);
        people2.setUserName("xiaoli");
        //people2.setVip(true);

        people people3 = new people();
        people3.setCash(80000);
        people3.setUserName("xiaochen");
        people3.setVip(true);

        proxyBuy proxyBuy = new proxyBuy();
        //第一个去买车
        proxyBuy.setPeople(people1);
        proxyBuy.buyCar();
        //第二个去买车
        proxyBuy.setPeople(people2);
        proxyBuy.buyCar();
        //第三个去买车
        proxyBuy.setPeople(people3);
        proxyBuy.buyCar();
    }
}
