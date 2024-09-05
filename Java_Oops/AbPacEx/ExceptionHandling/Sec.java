package AbPacEx.ExceptionHandling;

public class Sec
 {
    
        public static void main(String[] args) {
            try{
                if(args.length!=5){
                    throw new IllegalArgumentException("Exactly 5 integer arguments are required.");
                }
                int[] a=new int[5];
                int sum=0;
                for(int i=0;i<a.length;i++){
                    a[i]=Integer.parseInt(args[i]);
                }
                for(int i=0;i<a.length;i++){
                    sum+=a[i];
                }
                System.out.println("Sum:"+sum);
                double avg=(double)sum/a.length;
                System.out.println("Average:"+avg);
            }
            catch (NumberFormatException e) {
                // More specific exception
                System.out.println("Error: Please enter valid integer numbers.");
            } 
            catch (IllegalArgumentException e) {
                // More specific exception
                System.out.println(e.getMessage());
            }
            catch (ArithmeticException e) {
                // Unlikely in this code, but kept for demonstration
                System.out.println("Arithmetic error occurred: " + e.getMessage());
            } 
            catch (Exception e) {
                // Catch-all for any other unexpected exceptions
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }
    

//javac AbPacEx/ExceptionHandling/Sec.java
//java AbPacEx.ExceptionHandling.Sec 10 20 30 40 50 
