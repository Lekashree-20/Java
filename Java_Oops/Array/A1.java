package Array;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        System.out.println("Sum: "+sum);
        int avg=sum/2;
        System.out.println("Avg: "+avg);
    }
}
