
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        while (true) {
            String row = scanner.nextLine();
            if (row.isEmpty()) {
                break;
            }
            inputs.add(row);
        }
        String all = inputs.stream()
            .reduce("", (previousString, word) -> previousString + word + "\n");

        System.out.println(all);
        }
    }

