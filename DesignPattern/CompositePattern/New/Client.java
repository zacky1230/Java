package DesignPattern.CompositePattern.New;

import java.util.ArrayList;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 21:11.
 */
public class Client {
    public static void main(String[] args) {
        Branch ceo = compositeCorpTree();
        System.out.println(ceo.getInfo());
        System.out.println(getTreeInfo(ceo));
    }

    private static String getTreeInfo(Branch ceo) {
        ArrayList<Crop> subordinateList = ceo.getSubordinate();
        String info = "";
        for(Crop s : subordinateList){
            if(s instanceof Leaf){
                info = info + s.getInfo() + "\n";
            }else {
                info = info + s.getInfo() + "\n" + getTreeInfo((Branch)s);
            }
        }
        return info;
    }

    private static Branch compositeCorpTree() {
        Branch ceo = new Branch("王大麻子", "总经理", 100000);

        Branch developDep = new Branch("刘大瘸子", "研发部门经理", 10000);
        Branch salesDep = new Branch("马二拐子", "销售部门经理", 20000);
        Branch financeDep = new Branch("赵三驼子", "财务部门经理", 30000);

        Branch firstDevGroup = new Branch("杨三乜斜", "开发一组组长", 5000);
        Branch secondDevGroup = new Branch("吴大棒槌", "开发二组组长", 6000);
        Leaf a = new Leaf("a", "开发人员", 2000);
        Leaf b = new Leaf("b", "开发人员", 2000);
        Leaf c = new Leaf("c", "开发人员", 2000);
        Leaf d = new Leaf("d", "开发人员", 2000);
        Leaf e = new Leaf("e", "开发人员", 2000);
        Leaf f = new Leaf("f", "开发人员", 2000);
        Leaf g = new Leaf("g", "开发人员", 2000);
        Leaf h = new Leaf("h", "销售人员", 5000);
        Leaf i = new Leaf("i", "销售人员", 4000);
        Leaf j = new Leaf("j", "财务人员", 5000);
        Leaf k = new Leaf("k", "CEO秘书", 8000);
        Leaf zhengLaoLiu = new Leaf("郑老六", "研发部副总", 20000);
        ceo.addSubordinate(developDep);
        ceo.addSubordinate(salesDep);
        ceo.addSubordinate(financeDep);
        ceo.addSubordinate(k);
        developDep.addSubordinate(firstDevGroup);
        developDep.addSubordinate(secondDevGroup);
        developDep.addSubordinate(zhengLaoLiu);
        firstDevGroup.addSubordinate(a);
        firstDevGroup.addSubordinate(b);
        firstDevGroup.addSubordinate(c);
        secondDevGroup.addSubordinate(d);
        secondDevGroup.addSubordinate(e);
        secondDevGroup.addSubordinate(f);
        salesDep.addSubordinate(h);
        salesDep.addSubordinate(i);
        financeDep.addSubordinate(j);
        return ceo;
    }
}
