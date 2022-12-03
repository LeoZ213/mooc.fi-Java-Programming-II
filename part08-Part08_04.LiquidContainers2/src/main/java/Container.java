/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lzhan
 */
public class Container {

    private int amount;

    public Container() {
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        if (amount > 100 || (this.amount + amount > 100)) {
            this.amount = 100;
        } else {
            this.amount = this.amount + amount;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {  
            return;
        }
        if (amount > 100 || (this.amount - amount < 0)) {
            this.amount = 0;
            return;
        } else {
            this.amount = this.amount - amount;
        }
    }

    @Override
    public String toString() {
        return (this.amount + "/100");
    }
}
