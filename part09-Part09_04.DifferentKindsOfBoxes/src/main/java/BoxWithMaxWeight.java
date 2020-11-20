import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int maxWeight;
    private ArrayList<Item> items;
    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int sum = 0;
        for(Item i: items){
            sum+= i.getWeight();

        }
        if(sum+item.getWeight()<=maxWeight){
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);

    }
}
