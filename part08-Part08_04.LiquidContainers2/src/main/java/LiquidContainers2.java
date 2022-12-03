
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();
        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);
            String command = scan.nextLine();
            if (command.equals("quit")) {
                break;
            }
            String[] parts = command.split(" ");
            if (parts[0].equals("add")) {
                container1.add(Integer.valueOf(parts[1]));
            }
            if (parts[0].equals("move")) {
                if (container1.contains() >= Integer.valueOf(parts[1])) {
                    container1.remove(Integer.valueOf(parts[1]));
                    container2.add(Integer.valueOf(parts[1]));
                }
                if(container2.contains() < Integer.valueOf(parts[1])) {
                    container2.add(container1.contains());
                    container1.remove(1000);
                }
            }
            if (parts[0].equals("remove")) {
                if (container2.contains() == 0) {
                    continue;
                }
                if (container2.contains() < Integer.valueOf(parts[1])) {
                    container2.remove(1000);
                } else {
                    container2.remove(Integer.valueOf(parts[1]));
                }
            }
        }
    }

}
