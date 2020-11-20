public class Hideout<T> {
    private T hidden;

    public Hideout() {

    }

    public void putIntoHideout(T toHide) {
        if (hidden == null) this.hidden = toHide;

    }

    public T takeFromHideout() {
        T temp = hidden;
        hidden = null;
        return temp;
    }

    public boolean isInHideout() {
        return hidden != null;
    }
}
