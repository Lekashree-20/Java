public class DynamicProgramming {
    static int count = 0;
    static int count_2 = 0;
    static int dynamic(int n,int dp[]){
        count++;
        if(dp[n]!=0){
            return dp[n];
        }
        else if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        int fib_val=dynamic(n-1, dp)+dynamic(n-2, dp);
        dp[n]=fib_val;
        return fib_val;
    }

    static int bottom_up(int n,int dp[]){
        if(n>1) dp[1]=1;
        for(int i=2;i<n;i++){
            count_2++;
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }

    static int bottom_up_memory_optimized(int n){
        int fst=0;
        int sec=1;
        for(int i=1;i<n;i++){
            int temp=fst+sec;
            fst=sec;
            sec=temp;
        }

    }
    public static void main(String[] args) {
        //int count=0;
        int n=4;
        int[] dp={0,0,0,0};
        System.out.println(dynamic(n,dp));
        System.out.println("Count is"+" "+count);
        System.out.println(bottom_up_memory_optimized( n));
    }
}
