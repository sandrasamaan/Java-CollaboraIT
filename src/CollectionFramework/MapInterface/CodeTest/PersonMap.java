package CollectionFramework.MapInterface.CodeTest;

import CollectionFramework.MapInterface.HashMapExample;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PersonMap {
    public static void main(String[] args) {

    }


    public static HashMap<Integer, Person1 > getPersonMap
            (int key, long id, String name, Date dob, String address) {
        Map<Integer, Person1> map = new HashMap<>();


        Person1 person = new Person1();
        person.setPersonID(id);
        person.setPersonName(name);
        person.setPersonDOB(dob);
        person.setPersonAddress(address);

        map.put(key, person);
        Iterator<Map.Entry<Integer, Person1>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Person1> entry = iterator.next();
            System.out.println(entry);

        }return (HashMap<Integer, Person1>) map;



    }


}

