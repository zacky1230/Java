package DesignPattern.BridgePattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:40.
 */
public class Client {
    public static void main(String[] args) {
        HouseCrop houseCrop  = new HouseCrop();

        houseCrop.makeMoney();

        System.out.println("\n");

        ClothesCrop clothesCrop = new ClothesCrop();

        clothesCrop.makeMoney();

    }
}
