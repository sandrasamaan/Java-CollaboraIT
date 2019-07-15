package CollectionFramework.ListInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        //POJO plain old java objects class

        ArrayList<EMployee> emp = new ArrayList<>();
        EMployee empp = new EMployee();
        empp.setEmpFullName("Ram");
        empp.setEmpAddress("6011 Village Dr");
        empp.setEmpID(1122);
        empp.setEmpDepartment("Accountant");

        EMployee newEmp = new EMployee(1133, "Shaym", "407 Church st", "HR");

        emp.add(empp);
        emp.add(newEmp);

        System.out.println(emp);

        Iterator<EMployee> iterator = emp.iterator();
        while (iterator.hasNext());
        System.out.println(iterator.next());

    }
}
