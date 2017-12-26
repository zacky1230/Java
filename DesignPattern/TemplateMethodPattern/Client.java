package DesignPattern.TemplateMethodPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:43.
 */
public class Client {
    public static void main(String[] args) {
        HummerModel h1 = new HummerH1Model();
        h1.run();

        HummerModel h2 = new HummerH2Model();
        h2.run();
    }
}
