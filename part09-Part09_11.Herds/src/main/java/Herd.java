import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> organisms = new ArrayList<>();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Movable move: organisms){
            sb.append(move.toString()).append("\n");
        }
        return sb.toString();
    }

    public void addToHerd(Movable movable) {
        organisms.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable move : organisms) {
            move.move(dx, dy);
        }
    }
}
