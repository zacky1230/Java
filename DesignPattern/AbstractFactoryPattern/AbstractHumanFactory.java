package DesignPattern.AbstractFactoryPattern;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 23:24.
 */
public abstract class AbstractHumanFactory implements HumanFactory {
    protected Human createHuman(HumanEnum humanEnum){
        Human human = null;
        if(!humanEnum.getValue().equals("")){
            try{
                human = (Human) Class.forName(humanEnum.getValue()).newInstance();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return human;
    }
}
