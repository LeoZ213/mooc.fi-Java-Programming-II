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
public class Herd implements Movable {
  private ArrayList<Movable> organism;
  public Herd() {
    this.organism = new ArrayList<>();
  }
  @Override
  public String toString() {
    String all = "";
    for (Movable i : this.organism) {
      all = all + i + "\n";
    }
    return all;
  }
  public void addToHerd(Movable movable) {
    this.organism.add(movable);
  }
  @Override
  public void move(int dx, int dy) {
    for (Movable i : this.organism) {
      i.move(dx,dy);
    }
  }
}
