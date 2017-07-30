package DesignPattern.DecoratorPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 18:12.
 */
public class Father {
    public static void main(String[] args) {
        SchoolReport sr = new FouthGradeSchoolReport();
        sr.report();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);
        sr.sign("老三");
    }
}
