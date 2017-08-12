package DesignPattern.VisitorPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 16:19.
 */
public class CommonEmployee extends Employee {
    private String job;
    @Override
    public String getOtherInfo() {
        return "工作：" + this.job + "\t";
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void accept(IVisitor visitor){
        visitor.visit(this);
    }
}
