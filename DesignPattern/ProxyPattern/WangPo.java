package DesignPattern.ProxyPattern;

/**
 * Created by zacky on 10:30.
 */
public class WangPo implements KindWomen {
    private KindWomen kindWomen;

    public WangPo(){// 默认是panjinlian的代理人
        this.kindWomen = new PanJinLian();
    }

    public WangPo(KindWomen kindWomen){//任何人的代理人，只要钱到位
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();//其实不是王婆本人
    }

    @Override
    public void happyWithMan() {
        this.kindWomen.happyWithMan();//其实不是王婆本人
    }
}
