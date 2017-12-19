package DesignPattern.FacadePattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:48.
 */
public class Client {
    public static void main(String[] args) {
        LetterProcess letterProcess = new LetterProcessImpl();
        letterProcess.writeContext("Hello,It's me,do you know who I am?I'm your old lover.I'd like to ...");
        letterProcess.fillEnvelope("Happy Road No.6666");
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();

        System.out.println("----门面模式----");

        ModenPostOffice helloRoadPostOffice = new ModenPostOffice();
        String address = "Happy Road No.6666";
        String context = "Hello,It's me,do you know who I am?I'm your old lover.I'd like to ...";
        helloRoadPostOffice.sendLetter(context, address);
    }
}
