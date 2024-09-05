package Array;
 

 
import java.util.*;
public class A9 {
    
  

    // public static void printArr(int a[],int n){
    //     System.out.println("Original Array:");
    //     int i;
    //     for(i=0;i<n;i++){   //printing values
    //         System.out.println(a[i]);
    //     }
    // }
    public static void sortArr(int a[],int n){
        int i,j,b;

        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    b=a[j];
                    a[j]=a[j+1];
                    a[j+1]=b;
                }
            }
        }
        System.out.println("\n Array after sorting");
        for(i=0;i<n;i++){   
            System.out.println(a[i]);
        }
    }
    public static void tenArr(int a[],int n) {
        int i,p;
        for(i=0;i<n;i++){
            if(a[i]==10){
                p=i;
                a[p]=0;
            }
        }
        System.out.println("\n Array after removing 10");
        for(i=0;i<n;i++){   
            System.out.println(a[i]);
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
        //printArr(a,n);
        sortArr(a,n);
        tenArr(a,n);
        //aprintArr(a,n,temp);
       
    }

}

