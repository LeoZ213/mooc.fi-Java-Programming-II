/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lzhan
 */
import java.util.ArrayList;
public class Box implements Packable{
    private double maximumWeight;
    private ArrayList<Packable> packs;
    private int count;
    public Box(double maxWeight) {
        this.maximumWeight = maxWeight;
        this.packs = new ArrayList<>();
    }
    public void add(Packable pack) {
        if ((weight() + pack.weight()) > maximumWeight) {
            return;
        }
        this.packs.add(pack);
        count++;
    }
    @Override
    public double weight() {
        double weight = 0;
        for (Packable i : this.packs) {
            weight = weight + i.weight();
        }
        return weight;
    }
    @Override
    public String toString() {
        return "Box: " + this.count + " items, total weight " + weight() + " kg";
    }
}
