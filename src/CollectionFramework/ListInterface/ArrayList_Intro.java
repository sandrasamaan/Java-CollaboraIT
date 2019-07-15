package CollectionFramework.ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Intro {

    public static void main(String[] args) {


        //List declaration
        List<String> nameList = new ArrayList<>();
        //with class declaration
        ArrayList<String> list = new ArrayList<>();
        System.out.println(nameList);

        nameList.add("John");
        nameList.add("Sam");
        nameList.add("Sandra");

        System.out.println(nameList);

        for (int i = 0; i < nameList.size(); i++){

            if (nameList.get(i).equals("Josh")){
                System.out.println("This is Josh");
            }
            System.out.println(nameList.get(i));
        }

        //using iterator class
        Iterator<String> iterator = nameList.iterator();

        System.out.println("========== using iterator class=========");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }





    }
}
