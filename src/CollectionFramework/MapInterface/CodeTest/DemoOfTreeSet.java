package CollectionFramework.MapInterface.CodeTest;

import com.sun.source.util.Trees;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoOfTreeSet {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        integers.add(45);
        integers.add(65);
        integers.add(76);
        integers.add(23);
        System.out.println(integers);

        System.out.println("=== TreeSet ===");
        Set<Integer> set = new TreeSet<>(integers);
        System.out.println(set);
        Set<Person> personSet = new TreeSet<>();
        personSet.add(new Person(12, "John", new Date(), "Address"));
        personSet.add(new Person(13, "Josh", new Date(), "Address"));
        personSet.add(new Person(14, "Ema", new Date(), "Address"));
        personSet.add(new Person(15, "Adam", new Date(), "Address"));
        int i;
        for (i = 0; i < personSet.size(); i++) ;
        System.out.println(i);


    }
}
