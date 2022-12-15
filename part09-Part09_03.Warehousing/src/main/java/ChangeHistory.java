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
import java.util.Collections;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    @Override
    public String toString() {
        return String.valueOf(this.history);
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        return Collections.max(this.history);
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        return Collections.min(this.history);
    }

    public double average() {
        double sum = 0;
        int count = 0;
        for (double i : this.history) {
            sum = sum + i;
            count++;
        }
        return (sum / count);
    }
}
