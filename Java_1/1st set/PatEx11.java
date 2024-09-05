package Day2;

public class PatEx11 {
    public static void main(String[] args) {
    int n=4;
    int a=1;
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < i+1; j++) {
            System.out.print(a+" "); 
            a++;
        }
        System.out.println(); // Move to the next line after printing each row
    }
    }
    
}
