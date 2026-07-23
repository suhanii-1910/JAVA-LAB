// 1. Develop a Calculator program using overloaded methods for addition of integers
// and decimals. Use a static variable to count calculations.
class Calculator {

    // Static variable stores the number of objects created
    static int count = 0;

    // Constructor
    Calculator() {
        count++;
    }

    // Overloaded methods

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Static method
    static void displayCount() {
        System.out.println("Objects created: " + count);
    }
}

public class Suhani {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        System.out.println("Addition of two integers: " + c1.add(10, 20));

        System.out.println("Addition of two doubles: " + c1.add(12.5, 20.5));

        System.out.println("Addition of three integers: " + c1.add(1, 2, 3));

        Calculator.displayCount();
    }
}