package DesignPattern.IteratorPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 18:49.
 */
public interface IProject {
    public String getProjectInfo();

    public void add(String name, int num, int cost);

    public IProjectIterator iterator();
}
