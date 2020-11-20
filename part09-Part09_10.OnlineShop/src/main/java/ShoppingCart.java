import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShoppingCart {
    private Map<String, Item> map = new HashMap<>();

    public void add(String product, int price) {
        if (map.containsKey(product)) {
            map.get(product).increaseQuantity();
        } else {
            map.put(product, new Item(product, 1, price));

        }
    }

    public int price() {
        int i = 0;
        for (Item item : map.values()) {
            i += item.price();
        }
        return i;
    }

    public void print() {
        for (Map.Entry<String, Item> name : map.entrySet()) {
            System.out.println(name.getKey() + ": " + name.getValue().getQty());
        }
    }
}
