package AbPacEx.Package.com.wipro.automobile.Vehi3.FourVehicle4;



import AbPacEx.Package.com.wipro.automobile.Vehi3.Vehicle;

// Logan class extending Vehicle
public class Logan extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;

    // Constructor to initialize Logan attributes
    public Logan(String modelName, String registrationNumber, String ownerName, int speed) {
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

    // Additional methods specific to Logan
    public int speed() {
        return speed;
    }

    public void gps() {
        System.out.println("Controlling the GPS device.");
    }
}

