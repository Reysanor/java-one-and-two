public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        changeHistory = new ChangeHistory();
        changeHistory.add(initialBalance);
    }

    public String history() {
        return changeHistory.toString();
    }
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double d=  super.takeFromWarehouse(amount);
        changeHistory.add(getBalance());
        return d;

    }
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + changeHistory.minValue());
        System.out.println("Average: " + changeHistory.average());

    }
}
