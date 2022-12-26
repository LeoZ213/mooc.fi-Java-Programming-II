
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        while (true) {
            String row = scanner.nextLine();
            if (Integer.valueOf(row) < 0) {
                break;
            }
            inputs.add(row);
        }
                inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(s -> ((s <= 5) && (s >= 1)))
                .forEach(value -> System.out.println(value));

    }
}
