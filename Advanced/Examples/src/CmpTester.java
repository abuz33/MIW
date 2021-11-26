import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CmpTester {

    public static void main(String[] args) {
        Book b1 = new Book("Hersenschimmen", 19.99, 1984);
        Book b2 = new Book("Max Havelaar", 12.99, 1860);
        Book b3 = new Book("Donald Duck", 3.95, 2019);

        List<Book> l = new ArrayList<>();

        l.add( b1 ); l.add( b2 ); l.add( b3 );

        Collections.sort( l );
        System.out.println("Sorted by Title: " + l);

        Collections.sort( l, new PriceCmp() );
        System.out.println("Sorted by Price: " + l);

        Collections.sort( l, new YearCmp() );
        System.out.println("Sorted by Year: " + l);


        // Collections.reverseOrder draait een Comparator om.
        Collections.sort( l, Collections.reverseOrder(new YearCmp()) );
        System.out.println("Sorted by reverse Year: " + l);

    }
}
