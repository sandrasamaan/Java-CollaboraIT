package CollectionFramework.ListInterface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        // add 5 colors

        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Blue");
        colorList.add("White");
        colorList.add("Green");
        colorList.add("Red");
        colorList.add("Yellow");

        // Print list with iterator

        Iterator<String> newcolor = colorList.iterator();
        while (newcolor.hasNext()){
            System.out.println(newcolor.next());

        }
        //print first element only
        System.out.println(colorList.get(0));

        //index number of red

        System.out.println(colorList.indexOf("Red"));
        //update red with orange
        colorList.set(3,"Orange");
        System.out.println(colorList);

        //remove 4th element

        colorList.remove(4);
        System.out.println(colorList);

        //sort entire list by abc
        Collections.sort(colorList);
        System.out.println(colorList);

        //copy color list in a different list
        ArrayList<String> colorList2 = new ArrayList<>();
        colorList2.add("Black");
        colorList2.add("Silver");
        colorList2.add("Tan");

        colorList.addAll(colorList2);
        System.out.println(colorList);

        //print color in reverse order

        Collections.reverse(colorList);
        System.out.println(colorList);

        //Check capacity and size of the list
        System.out.println();
        System.out.println( colorList.size());

        //colorlist.clear
        colorList.clear();
        System.out.println(colorList);

        // implement the remove all
        colorList.removeAll(Collections.singleton("Tan"));
        System.out.println(colorList);

        //convert the array list into the array

        String arr [] = colorList.toArray(new String[colorList.size()]);
        System.out.println(Arrays.toString(arr));

        //add in arr
        arr[5] = "Pink";
        System.out.println(Arrays.toString(arr));

        //











    }
}
