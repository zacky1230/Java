package DesignPattern.AdapterPattern;

import java.util.Map;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 13:58.
 */
@SuppressWarnings("all")
public interface IOuterUser {
    public Map getUserBaseInfo();
    public Map getUserOfficeInfo();
    public Map getUserHomeInfo();
}
