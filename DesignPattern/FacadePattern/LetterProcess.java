package DesignPattern.FacadePattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:30.
 * 定义一个写信的过程
 */
public interface LetterProcess {
    //信的内容
    public void writeContext(String context);

    //其次写信封
    public void fillEnvelope(String address);

    //把信放到信封中
    public void letterIntoEnvelope();

    //然后邮递
    public void sendLetter();
}
