package DesignPattern.StrategeyPattern.Practise;

/**
 * Created by zacky on 7/16/17.
 */
public class Price {
    private IMemberStrategy memberStrategy;
    //构造方法，使用策略
    public Price(IMemberStrategy memberStrategy){
        this.memberStrategy = memberStrategy;
    }
    //使用策略，出招
    public double calPrice(double bookPrice){
        return this.memberStrategy.calPrice(bookPrice);
    }
}
