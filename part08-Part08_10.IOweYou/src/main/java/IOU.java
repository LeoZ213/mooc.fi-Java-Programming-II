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
public class IOU {
    private HashMap<String,Double> hash;
    public IOU() {
        this.hash = new HashMap<>();
    }
    public void setSum(String toWhom, double amount) {
        this.hash.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom) {
        if (this.hash.containsKey(toWhom)) {
            return this.hash.get(toWhom);
        }
        return 0;
    }
}
