package DesignPattern.AdapterPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 23:23.
 * 外系统用户信息
 */
public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfo = new HashMap();
        baseInfo.put("userName", "zhangsan");
        baseInfo.put("mobileNumber", "123456");
        return baseInfo;
    }

    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition", "boss");
        officeInfo.put("officeTelNumber", "09876");
        return officeInfo;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumber", "68597");
        homeInfo.put("homeAddress", "Happy Road 6666");
        return homeInfo;
    }
}
