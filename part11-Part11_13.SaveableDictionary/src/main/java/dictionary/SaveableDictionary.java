package dictionary;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;


public class SaveableDictionary {
    private HashMap<String, String> translations;
    private String file;
    public SaveableDictionary() {
        this.translations = new HashMap<>();
    }
    public SaveableDictionary(String file) {
        this.file = file;
        this.translations = new HashMap<>();
    }
    public void add(String words, String translation) {
        this.translations.putIfAbsent(words,translation);
    }
    public String translate(String word) {
        if ((!(this.translations.keySet().contains(word))) && (!(this.translations.values().contains(word)))) {
            return null;
        }
        if (this.translations.values().contains(word)) {
            for (String key : this.translations.keySet()) {
                if (this.translations.get(key).equals(word)) {
                    return key;
                }
            }
        }
        return this.translations.get(word);
    }
    public void delete(String word) {
        if (this.translations.keySet().contains(word)) {
            this.translations.remove(word);
        }
        if (this.translations.values().contains(word)) {
            for (String key : this.translations.keySet()) {
                if (this.translations.get(key).equals(word)) {
                    this.translations.remove(key);
                    break;
                }
            }
        }
    }
    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(this.file))){
            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                String[] parts = row.split(":");
                this.translations.put(parts[0],parts[1]);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    public boolean save() {
        try(PrintWriter writer = new PrintWriter(this.file)) {

            this.translations.keySet().stream()
                    .forEach(key -> writer.println(key + ":" + this.translations.get(key)));
            writer.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
