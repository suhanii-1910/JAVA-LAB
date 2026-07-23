class Mobile {

    String brand;
    String model;
    int price;

    // Default Constructor
    Mobile() {
        brand = "Samsung";
        model = "Galaxy A35";
        price = 30000;
    }

    // Parameterized Constructor
    Mobile(String b, String m, int p) {
        brand = b;
        model = m;
        price = p;
    }

    // Copy Constructor
    Mobile(Mobile m) {
        brand = m.brand;
        model = m.model;
        price = m.price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Mobile m1 = new Mobile();

        Mobile m2 = new Mobile("Apple", "iPhone 16", 80000);

        Mobile m3 = new Mobile(m2);

        System.out.println("Default Constructor:");
        m1.display();

        System.out.println();

        System.out.println("Parameterized Constructor:");
        m2.display();

        System.out.println();

        System.out.println("Copy Constructor:");
        m3.display();
    }
}