package Array;

import java.util.Scanner;



public class A5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Number of values: "+n);
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();   
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println("After sorting: "+ a[i]); 
        }
        if (n >= 2) {
            System.out.println("1st highest: " + a[n - 1]);
            System.out.println("2nd highest: " + a[n - 2]);
        } else if (n == 1) {
            System.out.println("1st highest: " + a[0]);
        } else {
            System.out.println("Array is empty.");
        }
    }
}




    

