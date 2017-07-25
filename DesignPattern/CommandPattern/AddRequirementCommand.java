package DesignPattern.CommandPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 19:15.
 */
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        super.rg.find();
        super.rg.add();
        super.rg.plan();
    }
}
