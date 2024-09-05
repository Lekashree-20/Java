package Array;

import java.util.Scanner;

public class A12 {
    public static void threeMid(int a[],int b[],int temp[],int n) {
        int i,p,q;
        temp[0]=a[n/2];
        temp[1]=b[n/2];
        for(i=0;i<2;i++){   
             System.out.println(temp[i]);
         }
    }
    
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        int[] a=new int[n];
        int[] b=new int[n];
        int[] temp=new int[2];
        int i;
        for(i=0;i<n;i++){   //getting input from user
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){   //getting input from user
            b[i]=sc.nextInt();
        }
        threeMid(a,b,temp,n);
    }
}
