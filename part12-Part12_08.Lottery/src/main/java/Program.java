
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        LotteryRow row = new LotteryRow();
        ArrayList<Integer> numbers;
        numbers = row.numbers();
        String numbersString = numbers.toString();
        System.out.println(numbersString);
        System.out.println(numbers.size());
        row.randomizeNumbers();

    }
}

