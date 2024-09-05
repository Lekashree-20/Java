package Collections.List.Two;

import java.util.ArrayList;

public class EmployeeDb {
    private ArrayList<Employee> list;

    // Constructor
    public EmployeeDb() {
        list = new ArrayList<>();
    }

    // Method to add an employee
    public boolean addEmployee(Employee e) {
        for (Employee emp : list) {
            if (emp.getEmpId() == e.getEmpId()) {
                System.out.println("Employee with ID " + e.getEmpId() + " already exists.");
                return false;
            }
        }
        list.add(e);
        return true;
    }

    // Method to delete an employee
    public boolean deleteEmployee(int empId) {
        for (Employee emp : list) {
            if (emp.getEmpId() == empId) {
                list.remove(emp);
                return true;
            }
        }
        System.out.println("Employee with ID " + empId + " not found.");
        return false;
    }

    // Method to show pay slip
    public String showPaySlip(int empId) {
        for (Employee emp : list) {
            if (emp.getEmpId() == empId) {
                return "Pay Slip for Employee ID " + empId + ":\n" +
                       "Name: " + emp.getEmpName() + "\n" +
                       "Salary: $" + emp.getSalary();
            }
        }
        return "Employee with ID " + empId + " not found.";
    }
}
