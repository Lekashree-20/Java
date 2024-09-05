package ZohoSet1.FaceTraining;

public class ExOne {

    // Factorial
    static int factorial(int num){
        if(num == 1 || num == 0){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }

    // Combination for nCr
    static double combination(int N, int R){
        return (factorial(N))/((factorial(R)*factorial(N-R)));
    }

    // Probability -> nCr/2**n
    static double count_heads( int N, int R){
        return (combination(N, R)) / Math.pow(2,N);
    }

    public static void main(String[] args) {
        int N = 4; // number of toss
        int R = 3; // number of desired heads
        double heads =  count_heads(N,R); // probability of getting R heads in N toss
        System.out.printf("%.6f",heads,heads);
    }
}

/*Another method

import java.util.*;

class main {
public static double fact(double n){
    double i;
    double a=1;
    for(i=n;i>=1;i--){
    a*=i;
    }
    return a;
}

    public static void main(String[] args) {
        double n=4;
        double r=3;
        double n_fact=fact(n);
        double r_fact=fact(r);
        double nr=n-r;
        double nr_fact=fact(nr);
        double nc=r_fact*nr_fact;
        double ncr=n_fact/nc;
        double c=Math.pow(2,n);
        double ans=ncr/c;
        
        System.out.printf("%.6f",ans);
        
    }
}

 */