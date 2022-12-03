
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hm = new HashMap<>();
        hm.put("a", "b");
        hm.put("c", "d");
        hm.put("e", "f");
        printKeysWhere(hm, "a");
    }

    public static void printKeys(HashMap<String, String> HashMap) {
        for (String key : HashMap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> HashMap, String text) {
        for (String key : HashMap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> HashMap, String text) {
        for (String key : HashMap.keySet()) {
            if (key.contains(text)) {
                System.out.println(HashMap.get(key));
            }
        }
    }

}
