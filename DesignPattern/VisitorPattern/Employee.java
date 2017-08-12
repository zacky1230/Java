package DesignPattern.VisitorPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 16:14.
 */
public abstract class Employee {
    public final static int MALE = 0;
    public final static int FEMALE = 1;

    private String name;
    private int salary;
    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public final void report(){
        String info = "姓名：" + this.name + "\t";
        info = info + "性别：" + (this.sex == FEMALE ? "女" : "男") + "\t";
        info = info + "薪水：" + this.salary + "\t";
        info = info + this.getOtherInfo();
        System.out.println(info);
    }

    public abstract String getOtherInfo();
}
