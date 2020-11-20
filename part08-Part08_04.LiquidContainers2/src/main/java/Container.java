import java.util.StringJoiner;

public class Container {
    int contain = 0;

    public Container(){

    }

    public void add(int amount) {
        if (amount > 0) {
            if (contain + amount > 100) {
                contain = 100;
            } else {
                contain += amount;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            if (contain - amount < 0) {
                contain=0;
            } else {
                contain-= amount;
            }
        }
    }

    public int contains() {
        return  contain;
    }

    @Override
    public String toString() {
        return contain+"/100";
    }
}
