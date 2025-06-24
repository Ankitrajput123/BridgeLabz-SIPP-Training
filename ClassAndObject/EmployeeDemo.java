// Define the Employee class
class Employee {
    // Attributes
    String name;
    int id;
    double salary;

    // Constructor to initialize employee details
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : ₹" + salary);
    }
}

// Main class to test the Employee class
public class EmployeeDemo {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp1 = new Employee("Ankit Thakur", 101, 55000.50);

        // Display the details
        emp1.displayDetails();
    }
}
