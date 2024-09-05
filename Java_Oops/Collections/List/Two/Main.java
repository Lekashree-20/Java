package Collections.List.Two;

public class Main {
    public static void main(String[] args) {
        EmployeeDb db = new EmployeeDb();

        // Create employees
        Employee emp1 = new Employee(1, "John Doe", "john.doe@example.com", "Male", 50000);
        Employee emp2 = new Employee(2, "Jane Smith", "jane.smith@example.com", "Female", 55000);

        // Add employees to the database
        db.addEmployee(emp1);
        db.addEmployee(emp2);

        // Show employee details
        emp1.GetEmployeeDetails();
        emp2.GetEmployeeDetails();

        // Show pay slips
        System.out.println(db.showPaySlip(1));
        System.out.println(db.showPaySlip(2));

        // Delete an employee
        db.deleteEmployee(1);
        System.out.println(db.showPaySlip(1));  // Should show not found message
    }
}

