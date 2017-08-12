package DesignPattern.VisitorPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 16:26.
 */
public interface IVisitor {
    public void visit(CommonEmployee commonEmployee);
    public void visit(Manager manager);
}
