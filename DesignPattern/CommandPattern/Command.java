package DesignPattern.CommandPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 19:14.
 */
public abstract class Command {
    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();
    public abstract void execute();
}
