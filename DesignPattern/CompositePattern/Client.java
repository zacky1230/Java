package DesignPattern.CompositePattern;

import java.util.ArrayList;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 22:43.
 */
public class Client {
    public static void main(String[] args) {
        IRoot ceo = new Root("王大麻子", "总经理", 100000);

        IBranch developDep = new Branch("刘大瘸子", "研发部门经理", 10000);
        IBranch salesDep = new Branch("马二拐子", "销售部门经理", 20000);
        IBranch financeDep = new Branch("赵三驼子", "财务部门经理", 30000);

        IBranch firstDevGroup = new Branch("杨三乜斜", "开发一组组长", 5000);
        IBranch secondDevGroup = new Branch("吴大棒槌", "开发二组组长", 6000);
        ILeaf a = new Leaf("a", "开发人员", 2000);
        ILeaf b = new Leaf("b", "开发人员", 2000);
        ILeaf c = new Leaf("c", "开发人员", 2000);
        ILeaf d = new Leaf("d", "开发人员", 2000);
        ILeaf e = new Leaf("e", "开发人员", 2000);
        ILeaf f = new Leaf("f", "开发人员", 2000);
        ILeaf g = new Leaf("g", "开发人员", 2000);
        ILeaf h = new Leaf("h", "销售人员", 5000);
        ILeaf i = new Leaf("i", "销售人员", 4000);
        ILeaf j = new Leaf("j", "财务人员", 5000);
        ILeaf k = new Leaf("k", "CEO秘书", 8000);
        ILeaf zhengLaoLiu = new Leaf("郑老六", "研发部副总", 20000);
        ceo.add(developDep);
        ceo.add(salesDep);
        ceo.add(financeDep);
        ceo.add(k);
        developDep.add(firstDevGroup);
        developDep.add(secondDevGroup);
        developDep.add(zhengLaoLiu);
        firstDevGroup.add(a);
        firstDevGroup.add(b);
        firstDevGroup.add(c);
        secondDevGroup.add(d);
        secondDevGroup.add(e);
        secondDevGroup.add(f);
        salesDep.add(h);
        salesDep.add(i);
        financeDep.add(j);
        System.out.println(ceo.getInfo());
        getAllSubordiateInfo(ceo.getSubordinateInfo());
    }

    private static void getAllSubordiateInfo(ArrayList subordinateInfo) {
        int length = subordinateInfo.size();
        for(int m = 0; m < length;m++){
            Object s = subordinateInfo.get(m);
            if(s instanceof Leaf){
                ILeaf employee = (ILeaf)s;
                System.out.println(employee.getInfo());
            } else {
                IBranch branch = (IBranch)s;
                System.out.println(branch.getInfo());
                getAllSubordiateInfo(branch.getSubordinateInfo());
            }
        }
    }
}
