package AbPacEx.Package.com.wipro.automobile.Vehi3.TwoWheeler;



import  AbPacEx.Package.com.wipro.automobile.Vehi3.Vehicle;

// Honda class extending Vehicle
public class Honda extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;

    // Constructor to initialize Honda attributes
    public Honda(String modelName, String registrationNumber, String ownerName, int speed) {
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

    // Additional methods specific to Honda
    public int getSpeed() {
        return speed;
    }

    public void cdplayer() {
        System.out.println("Controlling the CD player.");
    }
}

