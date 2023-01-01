package application;

public class StandardSensor implements Sensor{
    private int num;
    public StandardSensor(int num) {
        this.num = num;
    }
    public void setOn() {}
    public void setOff(){}
    public boolean isOn(){
        return true;
    }
    public int read() {
        return this.num;
    }
}
