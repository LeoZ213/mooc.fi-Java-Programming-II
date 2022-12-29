
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
public class LiteracyComparison {
    
    public static void main(String[] args) {

        try {

            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .filter(row -> row.length > 5)
                    .map(parts -> new Countries(parts[2], parts[3],Integer.valueOf(parts[4]),Double.valueOf(parts[5])))
                    .sorted()
                    .forEach(row -> System.out.println(row));
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }


    }
}
