package DesignPattern.StrategyPattern.Useage;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:36.
 */

/**
 * 日志写入到文件中
 */
public class FileLog implements LogStrategy {
    @Override
    public void log(String msg) {
        System.out.println(" 把日志" + msg + "写入文件了");
    }
}
