package DesignPattern.FactoryMethodPattern.SimpleFactory;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 08:37.
 */
public class Test {
    public static void main(String[] args) {
        VehicleFactory factory = new BroomFactory();
        Moveable m = factory.create();
        m.run();
    }
}
