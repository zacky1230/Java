package DesignPattern.DecoratorPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 18:36.
 */
public class SortDecorator extends Decorator {

    public SortDecorator(SchoolReport sr){
        super(sr);
    }

    private void reportSort(){
        System.out.println("我是排名第38名...");
    }
    @Override
    public void sign() {

    }
    @Override
    public void report(){
        super.report();
        this.reportSort();
    }
}
