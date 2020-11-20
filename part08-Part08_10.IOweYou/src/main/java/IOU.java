import java.util.HashMap;

public class IOU {
    private HashMap<String,Double> owes = new HashMap<>();

    public IOU() {

    }

    public void setSum(String toWhom, double amount) {
        owes.put(toWhom,amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.owes.getOrDefault(toWhom,0.0);
    }
}
