package DesignPattern.CommandPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 19:17.
 */
public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        super.pg.find();
        super.rg.delete();
        super.rg.plan();
    }
}
