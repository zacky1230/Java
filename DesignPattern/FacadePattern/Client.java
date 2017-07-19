package DesignPattern.FacadePattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 20:31.
 */
public class Client {
    public static void main(String[] args) {
        LetterProcess letterProcess = new LetterProcessImpl();
        letterProcess.writeContext("hello, it's me, how's going");
        letterProcess.fillEnvelope("Happy Road No.66");
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
