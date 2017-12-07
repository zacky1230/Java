package DesignPattern.MutilPattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 21:58.
 */
public class Emperor {
    private static int maxNumOfEmperor = 2;
    private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor);
    private static ArrayList emperorList = new ArrayList(maxNumOfEmperor);
    private static int countNumOfEmperor = 0;

    static {
        for(int i = 0; i < maxNumOfEmperor; i++){
            emperorList.add(new Emperor("皇"+(i+1)+"帝"));
        }
    }

    private Emperor(String info) {
        emperorInfoList.add(info);
    }

    public static Emperor getInstance(){
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return (Emperor) emperorList.get(countNumOfEmperor);
    }

    public static void emperorInfo(){
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }
}
