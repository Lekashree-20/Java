package Array;
import java.util.*;
public class A7 {
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
    public static void swapArr(int a[],int n,int temp[]){
        int i,j=0;
        //System.out.println("/n Swapping:");
        for(i=0;i<n-1;i++){ 
            if(a[i]!=a[i+1]){
                temp[j++]=a[i];
                
            }
        }
        temp[j++]=a[n-1];
    
        System.out.println("Temp Array");
        for(i=0;i<j;i++){   
            System.out.print(temp[i]+" ");
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
        swapArr(a,n,temp);
        //aprintArr(a,n,temp);
       
    }
}
