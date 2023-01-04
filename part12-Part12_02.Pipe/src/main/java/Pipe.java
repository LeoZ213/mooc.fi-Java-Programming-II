import java.util.List;
import java.util.ArrayList;
public class Pipe<T> {
    private List<T> values = new ArrayList<>();
    public void putIntoPipe(T value) {
        this.values.add(value);
    }
    public T takeFromPipe() {
        if (this.values.isEmpty()) {
            return null;
        }
        T previousValue = this.values.get(0);
        this.values.remove(0);
        return previousValue;
    }
    public boolean isInPipe() {
        if (this.values.isEmpty()) {
            return false;
        }
        return true;
    }
}
