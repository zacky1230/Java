package DesignPattern.DecoratorPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 18:18.
 */
public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {
    private void reportHighScore(){
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }
    private void reportSort(){
        System.out.println("我是排名第4名...");
    }
    @Override
    public void report(){
        this.reportHighScore();
        super.report();
        this.reportSort();
    }
}
