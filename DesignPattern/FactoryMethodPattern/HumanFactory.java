package DesignPattern.FactoryMethodPattern;

import java.util.List;
import java.util.Random;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 20:37.
 */
public class HumanFactory {
    public static Human createHuman(Class c){
        Human human = null;

        try{
            human = (Human)Class.forName(c.getName()).newInstance();
        }catch (InstantiationException e){
            System.out.println("必须制定人类的颜色");
        }catch (IllegalAccessException e){
            System.out.println("人类定义错误");
        }catch (ClassNotFoundException e){
            System.out.println("你指定的人类找不到");
        }

        return human;
    }

    public static Human createHuman(){
        Human human = null;
        List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class);
        Random random = new Random();
        int rand = random.nextInt(concreteHumanList.size());
        human = createHuman(concreteHumanList.get(rand));
        return human;
    }

}
