package Day3;

public class Test {
    public static void main(String[] args) {
        int[] a={7,1,5,3,6,4};
        int profit;
        int n=a.length;
        int max=0;
        int i,j;
        for( i=0;i<n;i++){
          if(!(a[i]>a[i-1]) && i!=0){
            for(j=i;j<=n-i;j++){
              if(a[i]>max){
                max=a[i];
              }
            }
            profit=max-a[i];
            System.out.println(profit);
          }
          
        }
        
    }
}
