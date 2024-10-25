class Item {
    private String name;
    private double price;
    private static int totalItemsSold = 0;
    private static double totalRevenue = 0.0;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void sell(int quantity) {
        totalItemsSold += quantity;
        totalRevenue += quantity * price;
    }

    public static int getTotalItemsSold() {
        return totalItemsSold;
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }
}

public class OnlineStore {
    public static void main(String[] args) {
        Item laptop = new Item("Laptop", 1000.0);
        laptop.sell(2);
        System.out.printf("Total Items Sold: %d%n", Item.getTotalItemsSold());
        System.out.printf("Total Revenue: $%.2f%n", Item.getTotalRevenue());
        Item smartphone = new Item("Smartphone", 500.0);
        laptop.sell(3);
        smartphone.sell(5);
        System.out.printf("Total Items Sold: %d%n", Item.getTotalItemsSold());
        System.out.printf("Total Revenue: $%.2f%n", Item.getTotalRevenue());
        Item newLaptop = new Item("Laptop", 1000.0);
        System.out.printf("Total Items Sold: %d%n", Item.getTotalItemsSold());
        System.out.printf("Total Revenue: $%.2f%n", Item.getTotalRevenue());
        Item anotherLaptop = new Item("Laptop", 1000.0);
        Item anotherSmartphone = new Item("Smartphone", 500.0);
        anotherLaptop.sell(1);
        anotherSmartphone.sell(4);
        System.out.printf("Total Items Sold: %d%n", Item.getTotalItemsSold());
        System.out.printf("Total Revenue: $%.2f%n", Item.getTotalRevenue());
        Item bulkLaptop = new Item("Laptop", 1000.0);
        bulkLaptop.sell(100);
        System.out.printf("Total Items Sold: %d%n", Item.getTotalItemsSold());
        System.out.printf("Total Revenue: $%.2f%n", Item.getTotalRevenue());
    }
}
