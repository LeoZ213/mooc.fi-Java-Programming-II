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
public class Abbreviations {
    HashMap<String,String> abbreviations;
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }
    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviations.put(abbreviation,explanation);
    }
    public boolean hasAbbreviation(String abbreviation) {
        String name = abbreviation;
        if (this.abbreviations.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }
    public String findExplanationFor(String abbreviation) {
        if (this.abbreviations.get(abbreviation) == null) {
            return null;
        } else {
            return this.abbreviations.get(abbreviation);
        }
    }
}
