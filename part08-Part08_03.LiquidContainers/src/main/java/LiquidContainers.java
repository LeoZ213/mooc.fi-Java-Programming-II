
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 = 0;
        int container2 = 0;

        while (true) {
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (input.equals("quit")) {
                break;
            }
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                if (amount < 0) {
                    continue;
                }
                if ((amount + container1) > 100) {
                    container1 = 100;
                } else {
                    container1 = container1 + amount;
                }
            }
            if (command.equals("move")) {
                if (amount < 0) {
                    continue;
                }
                if (amount > container1) {
                    container2 = container2 + container1;
                    container1 = 0;
                    continue;
                }
                if (amount >= 100 || (amount + container2) > 100) {
                    container1 = 0;
                    container2 = 100;
                    continue;
                }
                container1 = container1 - amount;
                container2 = container2 + amount;
            }
            if (command.equals("remove")) {
                if (amount < 0) {
                    continue;
                }
                if (amount > container2) {
                    container2 = 0;
                    continue;
                }
                container2 = container2 - amount;
            }
        }
    }

}
