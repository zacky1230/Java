package DesignPattern.BridgePattern.Change;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:54.
 */
public class Client {
    public static void main(String[] args) {
        House house = new House();
        HouseCrop houseCrop = new HouseCrop(house);

        houseCrop.makeMoney();

        System.out.println("\n");

        ShanZhaiCrop shanZhaiCrop = new ShanZhaiCrop(new Clothes());
        shanZhaiCrop.makeMoney();
    }
}
