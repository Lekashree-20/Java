package LogicBuilding.Day8;

import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
       
        while(n!=0){
            int temp=n%10;
            if(temp%2!=0){
                s=s+temp;
            }
            n/=10;
        }
        System.out.println(s);
        sc.close();
}
}
