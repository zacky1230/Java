package DesignPattern.FactoryMethodPattern.SimpleFactory;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 08:34.
 */
public class PlaneFactory extends VehicleFactory {
    @Override
    Moveable create() {
        return new Plane();
    }
}
