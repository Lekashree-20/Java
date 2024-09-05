package AbPacEx.Package.com.wipro.automobile.ship2;



public class TestCompartment {
    public static void main(String[] args) {
        // Create an object of the Compartment class with specific dimensions
        Compartment compartment = new Compartment(10.0, 20.0, 15.0);

        // Display the dimensions of the compartment
        System.out.println("Height: " + compartment.getHeight());
        System.out.println("Width: " + compartment.getWidth());
        System.out.println("Breadth: " + compartment.getBreadth());

        // Calculate and display the volume of the compartment
        double volume = compartment.getVolume();
        System.out.println("Volume of the compartment: " + volume);
    }
}
