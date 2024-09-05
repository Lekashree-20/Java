//Hands-on
package AbPacEx.Abstraction;


    abstract class Compartment {
        public abstract String notice();
    }
    
    class FirstClass extends Compartment {
        public String notice() {
            return "First Class: Welcome to the luxurious traveling experience.";
        }
    }
    
    class Ladies extends Compartment {
        public String notice() {
            return "Ladies Compartment: Reserved for ladies.";
        }
    }
    
    class General extends Compartment {
        public String notice() {
            return "General Compartment: Open for all passengers.";
        }
    }
    
    class Luggage extends Compartment {
        public String notice() {
            return "Luggage Compartment: Storage for luggage only.";
        }
    }
    
    public class TestCompartment {
        public static void main(String[] args) {
            Compartment[] compartments = new Compartment[10];
    
            // Randomly create instances of the different compartment types
            for (int i = 0; i < compartments.length; i++) {
                int type = (int) (Math.random() * 4) + 1; 
                // Math.random() generates a random double value between 0.0 (inclusive) and 1.0 (exclusive).
                //Multiplying this random value by 4 scales it to a range of 0.0 to 4.0 (exclusive).
                switch (type) {
                    case 1:
                        compartments[i] = new FirstClass();
                        break;
                    case 2:
                        compartments[i] = new Ladies();
                        break;
                    case 3:
                        compartments[i] = new General();
                        break;
                    case 4:
                        compartments[i] = new Luggage();
                        break;
                }
            }
    
            // Demonstrate polymorphic behavior
            for (Compartment comp : compartments) {
                System.out.println(comp.notice());
            }
        }
    }
    

