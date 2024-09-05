package Array;

import java.util.*;

public class A3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Number of values: "+n);
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println("Search value: "+k);
         boolean found=false;
        for(int i=0;i<n;i++){
            if(a[i]==k){
              System.out.println("Index: "+i);  
              found=true;
              break;
            }
        }
        if(!found){
            System.out.println("-1");
        }
        
    }
}
