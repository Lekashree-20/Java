package LogicBuilding.Day9;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp;
        int pal=0;
        temp=n;
        while(n!=0){
            int t=n%10;
            pal=(pal*10)+t;
            n/=10;
        }
        if(temp==pal){
            System.out.println("Palindrome");
        }
        else{
            System.out.println(" Not Palindrome");
        }
        sc.close();
    }
}
