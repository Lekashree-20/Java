package Oops.Class;

public class C1 {

    // Instance variables for dimensions
    private double width;
    private double height;
    private double depth;

    // Parameterized constructor to initialize dimensions
    public C1(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate and return the volume of the C1
    public double getVolume() {
        return width * height * depth;
    }

    // Main method to test the functionalities
    public static void main(String[] args) {
        // Create an object of the C1 class with specific dimensions
        C1 myC1 = new C1(5.0, 10.0, 3.0);

        // Calculate and display the volume of the C1
        double volume = myC1.getVolume();
        System.out.println("Volume of the C1: " + volume);
    }
}


