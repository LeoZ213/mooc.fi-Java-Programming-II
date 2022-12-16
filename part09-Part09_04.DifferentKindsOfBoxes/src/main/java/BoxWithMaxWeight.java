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
public class BoxWithMaxWeight extends Box{
  private int capacity;
  private ArrayList<Item> itemlist;
  public BoxWithMaxWeight(int capacity) {
    this.capacity = capacity;

    this.itemlist = new ArrayList<>();
  }
  @Override
  public void add(Item item) {
      int weight = 0;
      for (Item i : this.itemlist) {
          weight = weight + i.getWeight();
      }
      if ((item.getWeight() + weight) <= this.capacity) {
          this.itemlist.add(item);
      } else {
      }
  }
  @Override
  public boolean isInBox(Item item) {
    if (itemlist.contains(item)) {
      return true;
    } else {
      return false;
    }
  }
}
