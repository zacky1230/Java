package DesignPattern.AbstractFactoryPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 20:00.
 */
public abstract class AbstractHumanFactory implements HumanFactory{
    protected Human createHuman(HumanEnum humanEnum){
        Human human = null;

        if(!humanEnum.getValue().equals("")){
            try{
                human = (Human)Class.forName(humanEnum.getValue()).newInstance();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return human;
    }
}
