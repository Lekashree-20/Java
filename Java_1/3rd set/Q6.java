package Day4;

public class Q6 {
    public static void zSum(int a[][],int n1,int n2) {
        int sum=0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(i==0||i==n1-1||j==n1-i-1){
                    sum=sum+a[i][j];
                }
            }
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                System.out.println(sum);
                return;
            }
        }
    }
    public static void main(String[] args) {
        int a[][]={ {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n1=a.length;
        int n2=a[0].length;
        zSum(a,n1,n2);
    }
}
