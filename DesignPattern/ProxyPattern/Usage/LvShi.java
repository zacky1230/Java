package DesignPattern.ProxyPattern.Usage;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 23:00.
 */
public class LvShi implements ZiRanRen {
    @Override
    public void Quanli() {
        new MaYun().Quanli();
    }
}
