package application;
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> history;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.history = new ArrayList<>();
    }
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    public void setOn() {
        this.sensors.stream().forEach(sensor -> sensor.setOn());
    }
    public void setOff() {
        this.sensors.stream().forEach(sensor -> sensor.setOff());
    }
    public boolean isOn() {
        for (Sensor s : this.sensors) {
            if (s.isOn() == false) {
                return false;
            }
        }
        return true;
    }
    public int read() {
        if (isOn() == false || this.sensors.isEmpty()) {
            throw new IllegalStateException();
        }
        double i = this.sensors.stream().mapToInt(x -> Integer.valueOf(x.read())).average().getAsDouble();
        int x = (int) i;
        this.history.add(x);
        return x;
    }
    public List<Integer> readings() {
        return this.history;
    }
}
