public class Book implements Comparable<Book> {

    private String title;
    private double price;
    private int year;

    public Book(String title, double price, int year) {
        this.title = title;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "[" + title +
                ", " + price +
                ", " + year +
                "]";
    }

    @Override
    /**
     * Compare on year
     */
    public int compareTo(Book o) {
        return o.year - this.year;
    }


//    TWO ALTERNATIVE IMPLENTATIONS OF compareTo()
//
//    /**
//     * Compare on title, use String comparison.
//     */
//    public int compareTo(Book o) {
//        return this.title.compareTo( o.title );
//    }
//
//    /**
//     * Compare on price, use library
//     */
//    public int compareTo(Book o) {
//        return Double.compare( this.price, o.price);
//    }


    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Hersenschimmen", 19.99, 1984);
        Book b2 = new Book("Max Havelaar", 12.99, 1860);


        System.out.println("Comparing " + b1 + " and " + b2 + " result: " + b1.compareTo(b2));
    }

}
