package DesignPattern.DecoratorPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 22:33.
 */
public class FouthGradeSchoolReport extends SchoolReport {
    public void report() {
        System.out.println("尊敬的XXX家长：");
        System.out.println("-------------");
        System.out.println("语文62 数学65 英语70");
        System.out.println("-------------");
        System.out.println("家长签名：");
    }

    @Override
    public void sign() {

    }

}
