package DesignPattern.ChainOfResponsibilityPattern.update;

import DesignPattern.ChainOfResponsibilityPattern.IWomen;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 16:04.
 */
public class Women implements IWomen {
    private int type = 0;
    private String request = "";

    public Women(int _type, String _request){
        this.type = _type;
        switch (this.type){
            case 1:
                this.request = "女儿的请求是：" + _request;
                break;
        }
    }
    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
