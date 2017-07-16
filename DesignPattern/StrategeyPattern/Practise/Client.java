package DesignPattern.StrategeyPattern.Practise;

/**
 * Created by zacky on 7/16/17.
 */
public class Client {
    public static void main(String[] args) {
        Price price;
        System.out.println("-----初级会员-----");
        price = new Price(new PrimaryMemberStrategy());
        System.out.println("图书价格："+ price.calPrice(200));
        System.out.println("-----中级会员 9折-----");
        price = new Price(new IntermediateMemberStrategy());
        System.out.println("图书价格："+ price.calPrice(200));
        System.out.println("-----高级会员 8折-----");
        price = new Price(new AdvanceMemberStrategy());
        System.out.println("图书价格："+ price.calPrice(200));
    }
}
