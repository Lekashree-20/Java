//Quiz 2 corrected code
package AbPacEx.Abstraction;


    abstract class GBase {
        public void testBase() {
            System.out.println("Hello World");
        }
    }
    
    public class Sample2 extends GBase {
        public static void main(String[] args) {
            GBase ob = new Sample2();  // Create an instance of Sample, which is allowed
            ob.testBase();            // This will correctly print "Hello World"
        }
    }
    

