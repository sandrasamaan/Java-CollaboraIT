package CollectionFramework.ListInterface;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Predicate;
import java.util.logging.SocketHandler;

public class List_Methods {

    public static void main(String[] args) {

        // TODO: 7/11/2019
       /* ArrayList add() method example
        ArrayList addAll() method example
        ArrayList clear() method example
        ArrayList clone() – How to clone an ArrayList
        ArrayList contains() method example
        ArrayList ensureCapacity() method example
        ArrayList forEach() method example
        ArrayList get() method example
        ArrayList indexOf() method example
        ArrayList lastIndexOf() method example
        ArrayList listIterator() method example

        ArrayList remove() method example
        ArrayList removeAll() method example
        ArrayList retainAll() method example
        ArrayList replaceAll() method example
        ArrayList removeIf() method example
        ArrayList sort() method example
        ArrayList spliterator() method example
        ArrayList subList() method example
        ArrayList toArray() method example
        */


        ArrayList<String> list = new ArrayList<>();
       // ArrayList add() method example
                list.add("JAMES");
                list.add("JOHN");
                list.add("ROBERT");
                list.add("MICHAEL");
                list.add("DAVID");
                list.add("OLIVIA");
                list.add("EMILY");
                list.add("SOPHIA");
                list.add("MIA");
        System.out.println(list);

        //ArrayList AddAll() method example
        //add all method with anoter list into same list

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Oliver");
        nameList.add("Ava");
        nameList.add("Emma");

        list.addAll(nameList);
        System.out.println(list);

        //Arraylist clear

        //ArrayList clone() - how to clone an ArrayList
        //copy the existing list and create another list.

        ArrayList<String> tempList = (ArrayList<String>)list.clone();
        System.out.println("==========This is temp list=======");
        System.out.println(tempList);


       //ArrayList contains() method example

        //it returns the boolean value

        boolean nameCheck = list.contains("Emma");
        System.out.println(nameCheck);



      // ArrayList ensureCapacity() method example
        list.ensureCapacity(40);


      // ArrayList forEach() method example
        list.forEach(name -> System.out.println(name.toLowerCase()));
        list.forEach(name -> System.out.println(name.toUpperCase()));

        //ArrayList get() method example
        System.out.println("======This is Get Method=======");
        System.out.println(list.get(300));

       // ArrayList indexOf() method example
        System.out.println(list.indexOf("MIA"));


        //ArrayList lastIndexOf() method example // value is case sensitive
        //unavailable value will be run as negative
        System.out.println(list.lastIndexOf("DAVID"));

        //ArrayList listIterator() ,ethod example
        ListIterator<String> listIterator = list.listIterator();

        System.out.println("=== print list forward===");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());


        }
        System.out.println("===Print list backward===");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());

          //  ArrayList remove() method example

            //remove specific element from the list
            System.out.println("=== Remove Method===");
            list.remove("Olivia");
            System.out.println(list);

            //     ArrayList removeAll() method example
            System.out.println("=== RemoveAll Method");
            list.removeAll(Collections.singleton("DAVID"));
            System.out.println(list);

            //     ArrayList retainAll() method example
            ArrayList<String> alphabet = new ArrayList<>(Arrays.asList("A", "B", "A", "D", "A"));
            System.out.println("===alphabetList");
            alphabet.retainAll(Collections.singleton("A"));
            System.out.println(alphabet);




            // ArrayList replaceAll() method example

            alphabet.replaceAll((e -> e.toLowerCase()));
            System.out.println(alphabet);

            //     ArrayList removeIf() method example
            // based on some condition it will remove the value
            list.removeIf(n -> n.startsWith("J"));
            System.out.println(list);

            //     ArrayList sort() method example
            System.out.println("===Sorting the list");
            Collections.sort(list);
            System.out.println(list);


            //     ArrayList Spliterator() method example

            ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2,3,6,4,5,8,9,3));
            System.out.println("===Numbers List");
            System.out.println(numbers);

            Spliterator<Integer> spliterator = numbers.spliterator();
            spliterator.tryAdvance(num -> System.out.println(num));
            spliterator.trySplit();
            System.out.println(numbers);


            //     ArrayList subList() method example
            ArrayList<Integer> subListOne = new ArrayList<Integer>(Arrays.asList(2,3,6,4,5,8,9,3));
            ArrayList<Integer> subListTwo = new ArrayList<Integer>(Arrays.asList(2,4,6,4,5));
            System.out.println(subListOne);
            System.out.println(subListTwo);
            System.out.println(subListOne.subList(2, 5));

            //ArrayList toArray() method example
            ArrayList<Integer> tlist = new ArrayList<>();
            tlist.add(12);
            tlist.add(22);
            tlist.add(34);
            tlist.add(23);
            System.out.println(tlist);

            Integer arr[] = tlist.toArray(new Integer[tlist.size()]);
            System.out.println(Arrays.toString(arr));

          //

            }

        }



    }

