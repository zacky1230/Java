package DesignPattern.StrategeyPattern.Practise;

/**
 * Created by zacky on 7/16/17.
 */
public class AdvanceMemberStrategy implements IMemberStrategy {

    @Override
    public double calPrice(double booksPrice) {
        return booksPrice * 0.8;
    }
}
