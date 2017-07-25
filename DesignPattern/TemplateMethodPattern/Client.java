package DesignPattern.TemplateMethodPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 14:59.
 */
public class Client {
    public static void main(String[] args) {
        HummerH1Model h1 = new HummerH1Model();
        h1.setAlarm(false);
        h1.run();

        HummerH2Model h2 = new HummerH2Model();
        h2.run();
    }
}
