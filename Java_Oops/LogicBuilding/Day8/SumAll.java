package LogicBuilding.Day8;

import java.util.Scanner;

public class SumAll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
       
//         while(n!=0){
//             int temp=n%10;
//             s=s+temp;
//             n/=10;
//         }
//         System.out.println(s);
// }

            while(n/10!=0){ //n=84001 -> 13 ->4
                s=0;
                while(n!=0){
                    int temp=n%10;
                    s=s+temp;
                    n/=10;
                }
                n=s;
            }
            System.out.println(s);
            sc.close();
}
}
