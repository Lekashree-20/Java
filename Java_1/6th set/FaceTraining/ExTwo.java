package ZohoSet1.FaceTraining;

public class ExTwo {

    static int sum_of_diagonal ( int[][] arr){
        int sum = 0;
        for ( int i = 0; i < arr.length; i++){
            sum += arr[i][arr.length-i-1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5}, {6,7,8,9,0}, {1,2,3,4,5}, {6,7,8,9,0}, {1,2,3,4,5}};
        int res = sum_of_diagonal(arr);
        System.out.println(res);

    }
}

/* import java.util.*;
class A {
    public static void main(String[] args) {
      
       int[][] mulArr=new int[10][10];
       int num=1;
       int i,j;
       for(i=0;i<10;i++){
           for(j=0;j<10;j++){
               mulArr[i][j]=num;
               num++;
           }
       }
     
       int sum=0;
       int n=mulArr.length;
       for(i=0;i<10;i++){
           sum+=mulArr[i][n-i-1];
       }
       System.out.println(sum);
       
    }
} */


