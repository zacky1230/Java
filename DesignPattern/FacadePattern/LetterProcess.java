package DesignPattern.FacadePattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 20:26.
 */
public interface LetterProcess {
    public void writeContext(String context);
    public void fillEnvelope(String address);
    public void letterIntoEnvelope();
    public void sendLetter();
}
