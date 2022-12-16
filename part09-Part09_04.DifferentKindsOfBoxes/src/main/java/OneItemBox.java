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
public class OneItemBox extends Box{
  private ArrayList<Item> itemlist;
  public OneItemBox() {
    this.itemlist = new ArrayList<>();
  }
  @Override
  public void add(Item item) {
      if (this.itemlist.size() < 1) {
          this.itemlist.add(item);
      } else {          
      }
  }
  @Override
  public boolean isInBox(Item item) {
      if (this.itemlist.contains(item)) {
          return true;
      } else {
          return false;
      }
  }
}
