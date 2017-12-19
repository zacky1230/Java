package DesignPattern.FacadePattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:52.
 */
public class ModenPostOffice {
    private LetterProcess letterProcess = new LetterProcessImpl();

    public void sendLetter(String context, String address){
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
