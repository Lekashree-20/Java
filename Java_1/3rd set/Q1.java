
package Day4;
import java.util.*;
public class Q1 {
    public static void transpose(int a[][],int n1,int n2){
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                
                if( i!=j && i>j){
                    int temp=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
                }
                
            }
           
        }
        printArr(a,n1,n2);
    }
    public static void printArr(int a[][],int n1,int n2) {
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args){
        int a[][]={ {1,2,3},{4,5,6},{7,8,9}};
        int n1=a.length;
        int n2=a[0].length;
        transpose(a,n1,n2);
    }
}
