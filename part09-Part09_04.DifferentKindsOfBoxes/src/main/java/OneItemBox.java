public class OneItemBox extends Box {
    private Item onlyItem;

    public OneItemBox() {

    }

    @Override
    public void add(Item item) {
        if (onlyItem == null) onlyItem = item;
    }

    @Override
    public boolean isInBox(Item item) {
        return this.onlyItem != null && this.onlyItem.equals(item);
    }
}
