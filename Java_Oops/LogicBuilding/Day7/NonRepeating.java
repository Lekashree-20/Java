package LogicBuilding.Day7;

import java.util.Scanner;

public class NonRepeating {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,rem=0;
        int[] a={ 0, 0, 0, 0, 0, 
            0, 0, 0, 0, 0 };
        while(n!=0){
            rem=n%10;
            a[rem]=a[rem]+1;
            n/=10;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
        
     }
}

