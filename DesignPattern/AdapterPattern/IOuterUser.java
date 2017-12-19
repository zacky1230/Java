package DesignPattern.AdapterPattern;

import java.util.Map;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 23:21.
 * 外系统信息
 */
public interface IOuterUser {
    //基本信息
    public Map getUserBaseInfo();

    //工作区域信息
    public Map getUserOfficeInfo();

    //用户家庭信息
    public Map getUserHomeInfo();
}
