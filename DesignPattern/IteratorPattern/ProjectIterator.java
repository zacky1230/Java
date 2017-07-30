package DesignPattern.IteratorPattern;

import java.util.ArrayList;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 21:29.
 */
public class ProjectIterator implements IProjectIterator {

    private  ArrayList<IProject> projectList = new ArrayList<>();

    private  int currentItem = 0;

    public ProjectIterator(ArrayList<IProject> projectList){
        this.projectList = projectList;
    }

    @Override
    public boolean hasNext() {
        boolean b  = true;
        if(this.currentItem >= projectList.size() ||
                this.projectList.get(this.currentItem) == null)
                b = false;
        return b;
    }

    @Override
    public IProject next() {
        return (IProject)this.projectList.get(this.currentItem++);
    }

    public void remove(){}
}
