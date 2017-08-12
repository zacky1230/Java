package DesignPattern.ChainOfResponsibilityPattern.update;

import DesignPattern.ChainOfResponsibilityPattern.IWomen;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 15:59.
 */
public class Father extends Handler {
    public Father(int _level) {
        super(1);
    }

    @Override
    protected void reponse(IWomen women) {
        System.out.println("-----女儿向父亲请示");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是：同意\n");
    }
}
