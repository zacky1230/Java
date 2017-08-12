package DesignPattern.VisitorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 16:22.
 */
public class Client {
    public static void main(String[] args) {
        for(Employee employee : mockEmloyee()){
            employee.report();
        }
    }
    public static List<Employee> mockEmloyee(){
        List<Employee> employeeList = new ArrayList<>();

        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("写Java");
        zhangSan.setName("张三");
        zhangSan.setSalary(18000);
        zhangSan.setSex(Employee.MALE);
        employeeList.add(zhangSan);

        CommonEmployee lisi = new CommonEmployee();
        lisi.setJob("美工");
        lisi.setName("李四");
        lisi.setSalary(18000);
        lisi.setSex(Employee.FEMALE);
        employeeList.add(lisi);

        return employeeList;
    }
}
