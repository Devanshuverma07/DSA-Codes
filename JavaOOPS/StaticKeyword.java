package JavaOOPS;

// Rename the public class to match the file name
public class StaticKeyword {

    int empId; // Instance variable
    String name; // Instance variable
    static String companyName = "Orage Technologies"; // Static variable shared by all instances

    // Constructor name should match the class name
    StaticKeyword(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    // Instance method to display details
    void display() {
        System.out.println(companyName + " " + empId + " " + name);
    }

    public static void main(String[] args) {
        // Create instances using the constructor
        StaticKeyword emp1 = new StaticKeyword(1, "Alice");
        StaticKeyword emp2 = new StaticKeyword(2, "Bob");

        // Display details of employees
        emp1.display();
        emp2.display();
    }

}
