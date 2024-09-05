package AbPacEx.Package.com.wipro.automobile.Vehi3.FourVehicle4;



import AbPacEx.Package.com.wipro.automobile.Vehi3.Vehicle;

// Ford class extending Vehicle
public class Ford extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;

    // Constructor to initialize Ford attributes
    public Ford(String modelName, String registrationNumber, String ownerName, int speed) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.speed = speed;
    }

    // Implement abstract methods
    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    // Additional methods specific to Ford
    public int speed() {
        return speed;
    }

    public void tempControl() {
        System.out.println("Controlling the air conditioning device.");
    }
}
