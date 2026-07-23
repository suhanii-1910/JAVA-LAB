class Restaurant {

    static int totalOrders = 0;

    // Constructor
    Restaurant() {
        totalOrders++;
    }

    // Method Overloading

    double bill(double amount) {
        return amount;
    }

    double bill(double amount, double packingCharge) {
        return amount + packingCharge;
    }

    double bill(double amount, double packingCharge, double deliveryCharge) {
        return amount + packingCharge + deliveryCharge;
    }

    // Static Method
    static void displayOrders() {
        System.out.println("Total Orders: " + totalOrders);
    }
}

public class RestaurantManagement {

    public static void main(String[] args) {

        Restaurant r1 = new Restaurant();
        Restaurant r2 = new Restaurant();
        Restaurant r3 = new Restaurant();

        System.out.println("Dine-in Bill: " + r1.bill(500));

        System.out.println("Takeaway Bill: " + r2.bill(500, 20));

        System.out.println("Delivery Bill: " + r3.bill(500, 20, 50));

        Restaurant.displayOrders();
    }
}