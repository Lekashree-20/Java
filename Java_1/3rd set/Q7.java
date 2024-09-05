package Day4;

public class Q7 {
    public static void diagnolSum(int a[][],int n1,int n2) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(i==j){
                  sum1+=a[i][j];
                  
                }
                if(j==n1-i-1){
                  sum2+=a[i][j];
                 
                }
                
            }
            if(sum1==sum2){
                System.out.println("Equal");
                return;
            }
            
        }
        System.out.println("Not Equal");
        
    }
    public static void main(String[] args) {
        int a[][]={ {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n1=a.length;
        int n2=a[0].length;
        diagnolSum(a,n1,n2);
    }
    
}
/* Method2--without using 2 loops
    public class Q7 {
    public static void diagnolSum(int a[][],int n1,int n2) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n1;i++){
            
                sum1+=a[i][i];
                sum2+=a[i][n1-i-1];
                if(sum1==sum2){
                System.out.println("Equal");
                return;
            }
            
        }
        System.out.println("Not Equal");
        
    }
    public static void main(String[] args) {
        int a[][]={ {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n1=a.length;
        int n2=a[0].length;
        diagnolSum(a,n1,n2);
    }
    
} */