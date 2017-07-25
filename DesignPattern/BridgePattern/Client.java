package DesignPattern.BridgePattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 18:07.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("----房地产公司是这样运行的---");
        HouseCrop houseCrop = new HouseCrop();
        houseCrop.makeMoney();
        System.out.println();
        System.out.println("----服装公司是这样运行的---");
        ClothesCrop clothesCrop = new ClothesCrop();
        clothesCrop.makeMoney();
        System.out.println("----山寨公司运行----");
        IPodCrop iPodCrop = new IPodCrop();
        iPodCrop.makeMoney();
    }
}
