/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lzhan
 */
public class CustomTacoBox implements TacoBox {
    private int tacos;
    public CustomTacoBox(int initial) {
        this.tacos = initial;
    }
    @Override
    public void eat() {
        if (this.tacos == 0) {
            return;
        }
        this.tacos--;
    }
    @Override
    public int tacosRemaining() {
        return this.tacos;
    }
}
