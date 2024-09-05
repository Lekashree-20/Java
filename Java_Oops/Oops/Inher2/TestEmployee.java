package Oops.Inher2;

public class TestEmployee {
    public static void main(String[] args) {
        // Creating an instance of Employee
        Employee employee = new Employee("John Doe", 50000, 2020, "AB123456C");

        // Testing the getters
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        System.out.println("Year Started: " + employee.getYearStarted());
        System.out.println("National Insurance Number: " + employee.getNationalInsuranceNumber());

        // Testing the setters
        employee.setName("Jane Smith");
        employee.setAnnualSalary(55000);
        employee.setYearStarted(2019);
        employee.setNationalInsuranceNumber("XY987654Z");

        // Testing the getters again
        System.out.println("\nUpdated Employee Details:");
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        System.out.println("Year Started: " + employee.getYearStarted());
        System.out.println("National Insurance Number: " + employee.getNationalInsuranceNumber());
    }
}
