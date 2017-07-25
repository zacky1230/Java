package DesignPattern.BridgePattern.Change;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 18:38.
 */
public class HouseCorp extends Crop{

    public HouseCorp(House house) {
        super(house);
    }

    public void makeMoney(){
        super.makeMoney();
        System.out.println("房地产公司赚大钱了");
    }
}
