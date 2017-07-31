package DesignPattern.CompositePattern.New;

import java.util.ArrayList;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 21:09.
 */
public class Branch extends Crop {
    ArrayList<Crop> subordinateList = new ArrayList<>();
    public Branch(String _name, String _position, int _salary) {
        super(_name, _position, _salary);
    }
    public void addSubordinate(Crop crop){
        this.subordinateList.add(crop);
    }
    public ArrayList getSubordinate(){
        return this.subordinateList;
    }
}
