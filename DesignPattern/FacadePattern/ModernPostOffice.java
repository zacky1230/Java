package DesignPattern.FacadePattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 20:34.
 */
public class ModernPostOffice {
    private LetterProcess letterProcess = new LetterProcessImpl();

    private void sendLetter(String context, String address){
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
