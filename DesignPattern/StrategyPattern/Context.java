package DesignPattern.StrategyPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:08.
 * 计谋有了，放置锦囊
 */
public class Context {
    private IStrategy iStrategy;

    public Context (IStrategy strategy){
        this.iStrategy = strategy;
    }

    public void operate(){
        this.iStrategy.opearte();
    }
}
