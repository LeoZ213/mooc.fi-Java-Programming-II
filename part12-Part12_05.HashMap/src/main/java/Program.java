
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here
        HashMap<String, String> test = new HashMap<>();
        test.add("a", "b");
        test.add("c", "d");
        test.add("e", "f");
        System.out.println(test.get("a"));
        System.out.println(test.get("c"));
        System.out.println(test.get("e"));
        test.add("a","Replaced?");
        System.out.println(test.get("a"));
        for (int i = 0; i < 40; i++) {
            test.add(String.valueOf(i),String.valueOf(i+2));
        }
        System.out.println(test.get("30"));
    }

}
