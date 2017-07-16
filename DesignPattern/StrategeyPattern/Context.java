package DesignPattern.StrategeyPattern;

/**
 * Created by zacky on 7/16/17.
 */
public class Context {
    //构造方法，使用妙计
    private IStrategy strategy;
    public Context(IStrategy strategy){
        this.strategy = strategy;
    }

    //使用计谋
    public void operate(){
        this.strategy.operate();
    }
}
