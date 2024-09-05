package LogicBuilding.Day6;

import java.util.Scanner;

public class Fibonnaci {
    //With recursion
    // public static int fibVal(int n) {
    //     if(n==0){
    //         return 0;
    //     }
    //     else if(n==1 || n==2){
    //         return 1;
    //     }
    //     else{
    //         return fibVal(n-1)+fibVal(n-2);
           
    //     }

    //Without recursion
    public static int fib(int n) {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int sol=fibVal(n);
        // System.out.println(sol);
        int a=fib(n);
        System.out.println(a);
        sc.close();
    }
}
