
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here
        int[] numbers = {8,2,9,1,1};
        System.out.println(sum(numbers,0,numbers.length,0,999));

    }
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        int sum = 0;
        if (fromWhere < 0) {
            fromWhere = 0;
        }
        if (toWhere > array.length) {
            toWhere = array.length - 1;
        }
        for (int number = fromWhere;number < toWhere;number++)  {
            if (array[number] > largest || array[number] < smallest) {
                continue;
            }
            sum = sum + array[number];
        }
        return sum;
    }

}
