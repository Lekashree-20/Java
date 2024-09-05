package Day2;

public class PEx18 {
    public static void main(String[] args) {
        int bus=0;
        int sum=0;
        int m=3;
        int[] a={2,3,2,1};
        int n=a.length;
        for(int i=0;i<n;i++){
            if(sum+a[i]>m){
                bus++;
                sum=a[i];
            }
            else{
                sum+=a[i];
            }
            if(sum>0){
                bus++;
                System.out.println(bus);
            }

        }
    }
    
}
