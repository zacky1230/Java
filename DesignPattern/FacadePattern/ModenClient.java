package DesignPattern.FacadePattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 20:35.
 */
public class ModenClient {
    public static void main(String[] args) {
        ModernPostOffice hellRoadPostOffice = new ModernPostOffice();

        String address = "Happy Road No.66";
        String context = "Hello, It's me, do you know who I am?";

        //hellRoadPostOffice.sendLetter(context,address);
    }
}
