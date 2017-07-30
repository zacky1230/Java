package DesignPattern.DecoratorPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 18:31.
 */
public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport sr){
        super(sr);
    }
    private void reportHighScore(){
        System.out.println("这次考试语文是75，数学是78，自然是80");
    }
    @Override
    public void sign() {

    }
    @Override
    public void report(){
        this.reportHighScore();
        super.report();
    }
}
