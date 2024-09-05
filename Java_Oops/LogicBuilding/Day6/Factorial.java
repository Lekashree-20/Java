package LogicBuilding.Day6;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        int i;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=1;i<=n;i++){
            fact*=i;
        }
        
        System.out.println("Factorial: "+fact);
        
    }
}
