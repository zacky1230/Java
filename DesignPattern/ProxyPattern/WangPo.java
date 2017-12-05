package DesignPattern.ProxyPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:50.
 */
public class WangPo implements KindWomen {
    private KindWomen kindWomen;

    //默认代理人
    public WangPo(){
        this.kindWomen = new PanJinLian();
    }

    public WangPo(KindWomen kindWomen){
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();
    }

    @Override
    public void happyWithMan() {
        this.kindWomen.happyWithMan();
    }
}
