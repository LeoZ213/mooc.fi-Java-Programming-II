package application;
import java.util.Random;
public class TemperatureSensor implements Sensor{
    private boolean process;
    private Random random;
    public TemperatureSensor() {
        this.process = false;
        this.random = new Random();
    }
    public boolean isOn() {return this.process;}
    public void setOn() {
        this.process = true;
    }
    public void setOff() {
        this.process = false;
    }
    public int read() {
        if (this.process = false) {
            throw new IllegalStateException();
        }
        return new Random().nextInt(30+30)-30;
    }


}
