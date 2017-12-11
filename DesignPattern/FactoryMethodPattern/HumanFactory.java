package DesignPattern.FactoryMethodPattern;

import java.util.List;
import java.util.Random;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 22:49.
 */
public class HumanFactory {
    /**
     * 自定义
     *
     * @param c
     * @return
     */
    public static Human createHuman(Class c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (IllegalAccessException e) {
            System.out.println("必须制定人类的颜色");
        } catch (InstantiationException e) {
            System.out.println("人类定义错误");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到人类");
        }
        return human;
    }

    public static Human creatHuman() {
        Human human = null;
        List<Class> concreateHumanList = ClassUtils.getAllClassByInstance(Human.class);
        Random random = new Random();
        int rand = random.nextInt(concreateHumanList.size());

        human = createHuman(concreateHumanList.get(rand));

        return human;
    }
}
