package DesignPattern.ChainOfResponsibilityPattern.update;

import DesignPattern.ChainOfResponsibilityPattern.IWomen;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 15:54.
 */
public abstract class Handler {
    private int level = 0;

    private Handler nextHandler;

    public Handler(int _level){
        this.level = _level;
    }

    public final void HandleMessage(IWomen women){
        if(women.getType() == this.level){
            this.reponse(women);
        }else{
            if(this.nextHandler != null){
                this.nextHandler.HandleMessage(women);
            } else {
                System.out.println("-----没地方请示了，不做处理");
            }
        }
    }

    public void setNext(Handler _handler){
        this.nextHandler = _handler;
    }

    protected abstract void reponse(IWomen women);

}
