package LogicBuilding.Day7;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
            // n=n/10;
            // count++;
            int t=n%10;
            count++;
            n/=10;
        }
        System.out.println(count);
        sc.close();
     }
}
