import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private ArrayList<Double> content;

    public ChangeHistory() {
        content = new ArrayList<>();
    }

    public void add(double status) {
        content.add(status);
    }

    public void clear() {
        content.clear();
    }

    public String toString() {
        return content.toString();
    }
    public double maxValue(){
        if(content.isEmpty()) return 0;
       return Collections.max(content);
    }
    public double minValue(){
        if(content.isEmpty()) return 0;
        return Collections.min(content);
    }
    public double average(){
        if(content.isEmpty()) return 0;
        double value = 0.0;
        for(double d: content){
            value+=d;
        }
        return value/content.size();
    }
}
