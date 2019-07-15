package CollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {


        Map<Float, Long> mapp = new HashMap<>();
        mapp.put(1.1F, 1L);
        mapp.put(1.2F, 2L);
        mapp.put(1.3F, 3L);

        System.out.println(mapp);
        long oneValue = mapp.get(2);
        System.out.println("This is key value:" + oneValue);

        //remove the data
        mapp.remove(3);
        System.out.println("====Remove Method====");
        System.out.println(mapp);


        Iterator<Float> iterator = mapp.keySet().iterator();
        while (iterator.hasNext()) {
            Float key = iterator.next();
            Long valueOne = mapp.get(key);
            System.out.println("This is key: " + key + " and value is: " + valueOne);

        }

        // Loop via key and value both
        Iterator<mapp.Entry<Float, Long>> entryIterator = mapp.entrySet().iterator();
        while (entryIterator.hasNext()) ;
        mapp.Entry<Float, Long> entry = entryIterator.next();
        System.out.println("This is key :" + entry.getKey() + "This is value: " + entry.getValue());

    }
    }

}
