package DesignPattern.StrategyPattern.Useage;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:33.
 */

/**
 * 日志写到数据库
 */
public class DbLog implements LogStrategy {
    @Override
    public void log(String msg) {
        //制造错误
        if (msg != null && msg.trim().length() > 5) {
            int a = 5 / 0;
        }
        System.out.println("记录" + msg + "写入数据库了");
    }
}
