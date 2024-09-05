
//corrected code for quiz 1
package AbPacEx.Abstraction;


    abstract class Gbase {
        public abstract void testBase();
    }
    
    public class Sample extends Gbase {
        @Override
        public void testBase() {
            System.out.println("Base test implemented in Sample.");
        }
    
        public static void main(String[] args) {
            Sample ob = new Sample();
            ob.testBase();  // This will print: "Base test implemented in Sample."
        }
    }

    
    

