package AbPacEx.Package.com.wipro.automobile.ship2;

public class Compartment {

        // Instance variables for dimensions
        private double height;
        private double width;
        private double breadth;
    
        // Parameterized constructor to initialize dimensions
        public Compartment(double height, double width, double breadth) {
            this.height = height;
            this.width = width;
            this.breadth = breadth;
        }
    
        // Getters for the dimensions
        public double getHeight() {
            return height;
        }
    
        public double getWidth() {
            return width;
        }
    
        public double getBreadth() {
            return breadth;
        }
    
        // Method to calculate and return the volume of the compartment
        public double getVolume() {
            return height * width * breadth;
        }
    }

