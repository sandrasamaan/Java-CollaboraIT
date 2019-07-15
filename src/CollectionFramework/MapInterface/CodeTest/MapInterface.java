package CollectionFramework.MapInterface.CodeTest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer, Person> map3 = new HashMap<>();
        map3.put(1,new Person(11, "John", new Date(), "407 village dr"));
        map3.put(2, new Person(12, "Ema", new Date(), "123 church dr"));
        map3.put(3, new Person(13, "Adam", new Date(), "12 private dr");

        Person p1 = new Person();
        p1.setPersonID(12);
        p1.setName("SomeName");
        p1.setDOB(new Date());
        p1.setAddress("100 Main St.");
        map3.put(4, p1);
        System.out.println(map3);






    }
}
