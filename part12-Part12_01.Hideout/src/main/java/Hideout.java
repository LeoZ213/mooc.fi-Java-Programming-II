public class Hideout<T> {
    private T toHide;
    public void putIntoHideout(T toHide) {
        if (this.toHide == toHide) {
            takeFromHideout();
        }
        this.toHide = toHide;
    }
    public T takeFromHideout() {
        if (this.toHide.toString().isEmpty()) {
            return null;
        }
        T item = this.toHide;
        this.toHide = null;
        return item;
    }
    public boolean isInHideout() {
        if (this.toHide == null) {
            return false;
        }
        return true;
    }
}
