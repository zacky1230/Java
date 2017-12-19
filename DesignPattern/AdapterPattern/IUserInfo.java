package DesignPattern.AdapterPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 23:16.
 */
public interface IUserInfo {
    //获取用户姓名
    public String getUserName();

    //获取家庭地址
    public String getHomeAddress();

    //手机号码，这个太重要
    public String getMobileNumber();

    //办公室电话
    public String getOfficeTelNumber();

    //个人职位
    public String getJobPosition();

    //获取家庭电话
    public String getHomeTelNumber();
}
