package DesignPattern.AdapterPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 23:20.
 */
public class App {
    public static void main(String[] args) {
        //IUserInfo youngGirl = new UserInfo();
        IUserInfo youngGirl = new OuterUserInfo();
        for (int i = 0; i < 101; i++){
            youngGirl.getMobileNumber();
        }
    }
}
