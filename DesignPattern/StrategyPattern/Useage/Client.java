package DesignPattern.StrategyPattern.Useage;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:43.
 */
public class Client {
    public static void main(String[] args) {
        LogContext logContext = new LogContext();
        logContext.log("记录日志");
        logContext.log("再次记录日志");
    }
}
