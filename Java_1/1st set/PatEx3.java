package Day2;

public class PatEx3 {
    public static void main(String[] args) {
    int n=4;
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n-i; j++) {
            System.out.print("* "); // Print "*" without moving to the next line
        }
        System.out.println(); // Move to the next line after printing each row
    }
}
}
