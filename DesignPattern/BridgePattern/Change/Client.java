package DesignPattern.BridgePattern.Change;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 18:35.
 */
public class Client {
    public static void main(String[] args) {
        House house = new House();
        System.out.println("----房地产公司是这样运行的----");
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();

        System.out.println("----山寨公司是这样运行的----");
        ShanZhaiCrop shanZhaiCrop = new ShanZhaiCrop(new Clothes());
        shanZhaiCrop.makeMoney();
    }
}
