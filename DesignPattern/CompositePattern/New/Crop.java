package DesignPattern.CompositePattern.New;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 20:59.
 */
@SuppressWarnings("all")
public abstract class Crop {
    private String name = "";
    private String position = "";
    private int salary = 0;

    public Crop(String _name,String _position,int _salary){
        this.name = _name;
        this.position = _position;
        this.salary = _salary;
    }

    public String getInfo(){
        String info = "";
        info = "姓名：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }
}
