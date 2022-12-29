
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        int count = 0;
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            books.add(new Book(name, age));
            count++;
        }
        System.out.println(count + " books in total.");
        System.out.println();

        Comparator<Book> comparing = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        Collections.sort(books,comparing);

        books.stream()
                .forEach(book -> System.out.println(book));
    }

}
