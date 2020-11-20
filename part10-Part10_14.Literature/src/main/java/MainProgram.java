
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String row = scanner.nextLine();
            if (row.equals("")) {
                break;
            }
            System.out.print("Input the age recommendation: ");

            int age = Integer.parseInt(scanner.nextLine());
            books.add(new Book(row, age));
        }
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);

        Collections.sort(books, comparator);

        System.out.println(books.size() + " books in total.");
        System.out.println();
        System.out.println("Books");
        for (Book b : books) {
            System.out.println(b);
        }
    }

}
