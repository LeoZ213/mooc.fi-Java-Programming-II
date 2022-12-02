
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCount = 0;
        int sum = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            if (input < 0) {
                continue;
            } else {
                sum = sum + input;
                totalCount++;
            }
        }
        if (totalCount == 0) {
            System.out.println("Cannot calculate average");
        } else {
            System.out.println(sum / (double) totalCount);
        }
    }
}
