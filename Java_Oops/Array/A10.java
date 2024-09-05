package Array;

import java.util.Scanner;

public class A10 {
    public static void oddEven(int a[],int n,int temp[]) {
        int i,p;
        int j=0;
        for(i=0;i<n;i++){
            if(a[i]%2==0){
                temp[j++]=a[i];
            }
        }
         for(i=0;i<n;i++){
            if(a[i]%2!=0){
                temp[j++]=a[i];
            }
        }
        System.out.println("\n After shifting odd and even");
        for(i=0;i<j;i++){   
            System.out.println(temp[i]);
        }
    }
    
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] temp=new int[n];
        int i;
        for(i=0;i<n;i++){   //getting input from user
            a[i]=sc.nextInt();
        }
        oddEven(a,n,temp);
        
    }
}
