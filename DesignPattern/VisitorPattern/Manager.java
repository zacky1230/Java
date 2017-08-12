package DesignPattern.VisitorPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 16:20.
 */
public class Manager extends Employee {
    private String performance;
    @Override
    public String getOtherInfo() {
        return "业绩：" + this.performance + "\t";
    }

    public String getPerformance(){
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }
    public void accept(IVisitor visitor){
        visitor.visit(this);
    }
}
