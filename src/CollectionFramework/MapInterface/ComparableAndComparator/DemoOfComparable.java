package CollectionFramework.MapInterface.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoOfComparable {
    public static void main(String[] args) {

        List<Author> authors = new ArrayList<>();
        authors.add(new Author("John", "Samaan", 26));
        authors.add(new Author("Adam", "Smith", 36));
        authors.add(new Author("Ben", "Samaan", 50));

        Collections.sort(authors);
        System.out.println("==Sort by First Name==");
        for (Author au : authors) {
            System.out.println(au);

        }
        Collections.sort(authors);
        System.out.println("===Sort by authorAge==");
        for (Author au : authors) {
            System.out.println(au);
        }

        Collections.sort(authors);
        System.out.println("===Sort by lastName");
        for (Author au : authors) {
            System.out.println(au);
        }


    }
}

class AuthorAgeComparator implements Comparator<Author> {

    @Override
    public int compare(Author o1, Author o2) {
        if (o1.authorAge == o2.authorAge) {
            return 0;

        } else if (o1.authorAge > o2.authorAge) {
            return 1;
        } else {
            return -1;
        }



    }

}








