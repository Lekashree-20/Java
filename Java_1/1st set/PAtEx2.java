package Day2;

public class PAtEx2 {
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print("* "); // Print "*" without moving to the next line
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
