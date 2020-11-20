import java.util.ArrayList;

public class Box implements Packable {
    private double maxWeight;
    private ArrayList<Packable> things;


    public Box() {
    }

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        things = new ArrayList<>();
    }

    @Override
    public double weight() {
        double i = 0.0;
        for (Packable p : things) {
            i += p.weight();
        }
        return i;
    }

    public void add(Packable packable) {
        if (weight()<maxWeight-packable.weight()) things.add(packable);
    }

   public String toString(){
        return "Box: "+ things.size()+" items, total weight "+ weight()+" kg";
    }
}
