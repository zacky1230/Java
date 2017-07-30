package DesignPattern.CompositePattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 22:40.
 */
public class Leaf implements ILeaf {
    private String name = "";
    private String position = "";
    private int salary = 0;
    public Leaf(String name,String position,int salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    @Override
    public String getInfo() {
        String info = "";
        info = "名称：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }
}
