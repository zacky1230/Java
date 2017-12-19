package DesignPattern.AdapterPattern;

import java.util.Map;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 23:28.
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {
    private Map baseInfo = super.getUserBaseInfo();
    private Map homeInfo = super.getUserHomeInfo();
    private Map officeInfo = super.getUserOfficeInfo();
    @Override
    public String getUserName() {
        String userName = (String) baseInfo.get("useName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        return null;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String) baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        return null;
    }

    @Override
    public String getJobPosition() {
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        return null;
    }
}
