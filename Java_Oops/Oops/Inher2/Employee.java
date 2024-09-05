package Oops.Inher2;

public class Employee extends Person {
    private double annualSalary;
    private int yearStarted;
    private String nationalInsuranceNumber;

    // Constructor
    public Employee(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // Getter and Setter methods for annualSalary
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    // Getter and Setter methods for yearStarted
    public int getYearStarted() {
        return yearStarted;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    // Getter and Setter methods for nationalInsuranceNumber
    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
}
