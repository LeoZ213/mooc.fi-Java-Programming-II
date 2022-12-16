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
public class MisplacingBox extends Box {
  private ArrayList<Item> itemlist;
  public MisplacingBox() {
    this.itemlist = new ArrayList<>();
  }
  @Override
  public void add(Item item) {
    this.itemlist.add(item);
  }
  @Override
  public boolean isInBox(Item item) {
    return false;
  }
}
