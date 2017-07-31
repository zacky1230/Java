package DesignPattern.ObserverPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 22:44.
 */
class Watch extends Thread {
    private HanFeiZi hanFeiZi;
    private LiSi liSi;
    private String type;

    public Watch(HanFeiZi _hanFeiZi,LiSi _liSi,String _type){
        this.hanFeiZi = _hanFeiZi;
        this.liSi = _liSi;
        this.type = _type;
    }

    @Override
    public void run(){
        while(true){
            if(this.type.equals("breakfast")){
                if(this.hanFeiZi.isHaveBreakfast()){
                    this.liSi.update("韩子非在吃饭");
                    this.hanFeiZi.setHaveBreakfast(false);
                }
            }else {
                if(this.hanFeiZi.isHaveFun()){
                    this.liSi.update("韩子非在娱乐");
                    this.hanFeiZi.setHaveFun(false);
                }
            }
        }
    }
}
