package DesignPattern.ProxyPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:52.
 */
public class XiMenQing {
    public static void main(String[] args) {
        WangPo wangPo = new WangPo();
        wangPo.makeEyesWithMan();
        wangPo.happyWithMan();
        WangPo wangPo1 = new WangPo(new JiaShi());
        wangPo1.makeEyesWithMan();
        wangPo1.happyWithMan();
    }
}
