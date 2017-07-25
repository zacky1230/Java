package DesignPattern.CommandPattern;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 18:59.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("-----客户要求增加一个需求");
        Group rg = new RequirementGroup();
        rg.find();
        rg.add();
        rg.plan();
        System.out.println("-----客户要求删掉一个页面");
        Group pg = new PageGroup();
        pg.find();
        pg.delete();
        pg.plan();

        Invoker xiaoSan = new Invoker();
        System.out.println("客户要求增加一项需求");
        Command command = new AddRequirementCommand();
        xiaoSan.setCommand(command);
        xiaoSan.action();
    }
}
