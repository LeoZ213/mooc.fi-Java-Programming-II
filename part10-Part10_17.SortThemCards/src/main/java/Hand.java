import java.util.ArrayList;
import java.util.Collections;
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand= new ArrayList<>();
    public void add(Card card) {
        hand.add(card);
    }
    public void print() {
        hand.stream()
                .forEach(card -> System.out.println(card));
    }
    public void sort() {
        Collections.sort(hand);
    }
    public int getValue() {
        return hand.stream()
                .mapToInt(card -> card.getValue())
                .sum();
    }
    public int compareTo(Hand anotherHand) {
        if (getValue() == anotherHand.getValue()) {
            return 0;
        }
        if (anotherHand.getValue() > getValue()) {
            return -1;
        }
        return 1;
    }
    public void sortBySuit() {
        Collections.sort(hand, new BySuitInValueOrder());;
            }
        }
