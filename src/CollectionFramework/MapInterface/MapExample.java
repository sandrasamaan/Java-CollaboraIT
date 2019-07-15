package CollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {


        Map<Float, Long> mapp = new HashMap<>();
        mapp.put(1.1F, 1L);
        mapp.put(1.2F, 2L);
        mapp.put(1.3F, 3L);

        System.out.println(mapp);
        long value = mapp.get(2);
        System.out.println("This is key value:" + value);


        //HashMap Declaration
        Map<Integer, String> map = new HashMap<>();

        //Add the data
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "A");
        map.put(5, "B");
        map.put(6, "C");
        System.out.println(map);

        //read the specific dataset

        String value = map.get(2);
        System.out.println("This is key value:" + value);

        //remove the data
        map.remove(3);
        System.out.println("====Remove Method====");
        System.out.println(map);


        //How to loop HashMap

        //Loop via key only
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            String valueOne = map.get(key);
            System.out.println("This is key: " + key + " and value is: " + valueOne);

        }

        // Loop via key and value both
        Iterator<Map.Entry<Integer, String>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) ;
        Map.Entry<Integer, String> entry = entryIterator.next();
        System.out.println("This is key :" + entry.getKey() + "This is value: " + entry.getValue());

    }

    /* 1- One HashMap with key = float type and value = Long
     2- Add the data
     3- Remove one entry
     4- Loop via key and key/value
     */

}

