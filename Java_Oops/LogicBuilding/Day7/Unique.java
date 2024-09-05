package LogicBuilding.Day7;

import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[10];
        int rem=0;
        int count=0;
        while(n!=0){
            rem=n%10;
            if(a[rem]==0){
                a[rem]=1;
                count++;
            }
            n/=10;
        }
        System.out.println(count);
        sc.close();
}
}
