package DesignPattern.ProxyPattern;

/**
 * Created by zacky on 10:35.
 */
public class XiMenQing {
    public static void main(String[] args) {
        WangPo wangPo = new WangPo();
        wangPo.makeEyesWithMan();//看着是wangpo，其实并不是
        wangPo.happyWithMan();//看着是wangpo，其实并不是
        WangPo wangPo1 = new WangPo(new JiaShi());
        wangPo1.makeEyesWithMan();
        wangPo1.happyWithMan();
    }
}
