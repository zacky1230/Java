package DesignPattern.CompositePattern;

import java.util.ArrayList;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 22:10.
 */
public interface IRoot {
    public String getInfo();
    public void add(IBranch branch);
    public void add(ILeaf leaf);
    public ArrayList getSubordinateInfo();
}
