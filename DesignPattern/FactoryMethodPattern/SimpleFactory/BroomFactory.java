package DesignPattern.FactoryMethodPattern.SimpleFactory;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 08:37.
 */
public class BroomFactory extends VehicleFactory {
    @Override
    Moveable create() {
        return new Broom();
    }
}
