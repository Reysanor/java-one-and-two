import java.util.LinkedList;
import java.util.Scanner;

public class Pipe<T> {
    LinkedList<T> objects = new LinkedList<>();

    public Pipe() {
    }

    public void putIntoPipe(T value) {
        objects.add(value);
    }

    public T takeFromPipe() {
        if (objects.isEmpty()) return null;
        T temp = objects.getFirst();

        objects.removeFirst();
        return temp;
    }

    public boolean isInPipe() {
        return !objects.isEmpty();
    }
}
