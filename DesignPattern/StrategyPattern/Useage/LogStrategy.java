package DesignPattern.StrategyPattern.Useage;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:29.
 */
public interface LogStrategy {
    /**
     * 日志记录的策略接口
     * @param msg
     */
    public void log(String msg);
}
