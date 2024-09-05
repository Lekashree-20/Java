package Day2;

public class PatEx13 {
    public static void main(String[] args) {
      
            int n=4;
            int a=1;
            int b=(n*n)+1;
            for(int i = 0; i < n; i++) {
                for(int j =0;j<i;j++) {
                    System.out.print("   "); // Print "*" without moving to the next line
                }
                for(int j =0;j<n-i;j++) {
                    System.out.print(a+"* "); 
                    a++;// Print "*" without moving to the next line
                }
                for(int j =0;j<n-i-1;j++) {
                    System.out.print(b+"* "); 
                    b++;// Print "*" without moving to the next line
                }
                System.out.println(b); // Move to the next line after printing each row
                b=b-2*(n-i-1);
            }
        }
}
