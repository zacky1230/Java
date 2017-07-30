package DesignPattern.DecoratorPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 22:32.
 */
public abstract class SchoolReport {
    public abstract void report();
    public abstract void sign();
    public void sign(String name){
        System.out.println("家长签名为：" + name);
    }
}
