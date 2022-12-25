
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> negative = new ArrayList<>();
        ArrayList<String> positive = new ArrayList<>();
        // toteuta ohjelmasi tänne
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            if (Integer.valueOf(row) < 0) {
                negative.add(row);
            } else {
                positive.add(row);
            }
        }
        double negativeAverage = negative.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        double positiveAverage = positive.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String answer = scanner.nextLine();
        if (answer.equals("n")) {
            System.out.println("Average of the negative numbers: " + negativeAverage);
        } else {
            System.out.println("Average of the positive numbers: " + positiveAverage);
        }
    }
}
