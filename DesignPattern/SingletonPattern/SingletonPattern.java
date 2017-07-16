package DesignPattern.SingletonPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 13:57.
 */
@SuppressWarnings("all")
public class SingletonPattern {
    /**
     * 单例模式通用模板--线程不安全
     */
    /*private static SingletonPattern singletonPattern = null;
    private SingletonPattern(){}
    public SingletonPattern getInstance(){
        if(this.singletonPattern == null){
            this.singletonPattern = new SingletonPattern();
        }
        return this.singletonPattern;
    }*/
    /**
     * 单例模式通用模板-线程安全
     */
    private static final SingletonPattern singletonPattern = new SingletonPattern();

    private SingletonPattern(){}//限制住不能直接产生一个实例

    public synchronized static SingletonPattern getInstance(){
        return singletonPattern;
    }
}
