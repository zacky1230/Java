package DesignPattern.CommandPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 19:18.
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }
    public void action(){
        this.command.execute();
    }
}
