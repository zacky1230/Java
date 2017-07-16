package DesignPattern.StrategeyPattern.Practise;

/**
 * Created by zacky on 7/16/17.
 */
public class PrimaryMemberStrategy implements IMemberStrategy {

    @Override
    public double calPrice(double booksPrice) {
        return booksPrice;
    }
}
