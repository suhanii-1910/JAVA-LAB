class Student {

    int id;
    String name;

    // Parameterized Constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // Copy Constructor
    Student(Student s) {
        id = s.id;
        name = s.name;
    }

    // Default Constructor
    Student() {
        id = 194;
        name = "Suhani Garg";
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student(194, "Suhani");

        Student s3 = new Student(s2);

        System.out.println("Default Constructor:");
        s1.display();

        System.out.println();

        System.out.println("Parameterized Constructor:");
        s2.display();

        System.out.println();

        System.out.println("Copy Constructor:");
        s3.display();
    }
}