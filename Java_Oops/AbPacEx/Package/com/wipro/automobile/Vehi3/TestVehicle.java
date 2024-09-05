package AbPacEx.Package.com.wipro.automobile.Vehi3;



import AbPacEx.Package.com.wipro.automobile.Vehi3.FourVehicle4.Ford;
import AbPacEx.Package.com.wipro.automobile.Vehi3.FourVehicle4.Logan;
import AbPacEx.Package.com.wipro.automobile.Vehi3.TwoWheeler.Hero;
import AbPacEx.Package.com.wipro.automobile.Vehi3.TwoWheeler.Honda;

public class TestVehicle {
    public static void main(String[] args) {
        // Create Hero object
        Hero hero = new Hero("Hero Splendor", "KA03AB1234", "John Doe", 60);
        
        // Display Hero details
        System.out.println("Hero Model Name: " + hero.getModelName());
        System.out.println("Hero Registration Number: " + hero.getRegistrationNumber());
        System.out.println("Hero Owner Name: " + hero.getOwnerName());
        System.out.println("Hero Speed: " + hero.getSpeed());
        hero.radio();

        // Create Honda object
        Honda honda = new Honda("Honda Activa", "KA05CD5678", "Jane Smith", 50);

        // Display Honda details
        System.out.println("Honda Model Name: " + honda.getModelName());
        System.out.println("Honda Registration Number: " + honda.getRegistrationNumber());
        System.out.println("Honda Owner Name: " + honda.getOwnerName());
        System.out.println("Honda Speed: " + honda.getSpeed());
        honda.cdplayer();

         Logan logan = new Logan("Logan Sedan", "MH01EF7890", "Alice Brown", 80);
        System.out.println("Logan Model Name: " + logan.getModelName());
        System.out.println("Logan Registration Number: " + logan.getRegistrationNumber());
        System.out.println("Logan Owner Name: " + logan.getOwnerName());
        System.out.println("Logan Speed: " + logan.speed());
        logan.gps();

        // Create Ford object
        Ford ford = new Ford("Ford Mustang", "DL02GH3456", "Bob White", 120);
        System.out.println("Ford Model Name: " + ford.getModelName());
        System.out.println("Ford Registration Number: " + ford.getRegistrationNumber());
        System.out.println("Ford Owner Name: " + ford.getOwnerName());
        System.out.println("Ford Speed: " + ford.speed());
        ford.tempControl();
    }
}

