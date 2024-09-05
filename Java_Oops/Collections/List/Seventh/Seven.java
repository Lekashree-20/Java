package Collections.List.Seventh;

public class Seven {
    private int empId;
    private String empName;
    private String email;

    // Constructor
    public Seven(int empId, String empName, String email) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
    }

    // Getters
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmail() {
        return email;
    }

    // Override toString method to display employee details
    @Override
    public String toString() {
        return "Employee ID: " + empId + ", Name: " + empName + ", Email: " + email;
    }
}
