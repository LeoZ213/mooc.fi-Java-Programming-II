/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lzhan
 */
import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        this.dictionary.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        ArrayList<String> empty = new ArrayList<>();
        if (!(this.dictionary.keySet().contains(word))) {
            return empty;
        } else {
            return this.dictionary.get(word);
        }
    }

    public void remove(String word) {
        if (!(this.dictionary.keySet().contains(word))) {
            return;
        } else {
            this.dictionary.get(word).clear();
            this.dictionary.remove(word);
        }
    }
}
