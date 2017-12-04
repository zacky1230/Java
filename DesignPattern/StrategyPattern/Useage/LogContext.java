package DesignPattern.StrategyPattern.Useage;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:38.
 */
public class LogContext {
    public void log(String msg){
        //优先记录数据库
        LogStrategy logStrategy = new DbLog();
        try{
            logStrategy.log(msg);
        }catch (Exception err){
            logStrategy = new FileLog();
            logStrategy.log(msg);
        }
    }
}
