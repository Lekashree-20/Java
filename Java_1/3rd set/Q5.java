package Day4;

public class Q5 {
    public static void snakePattern(int a[][],int n1,int n2) {
        int temp;
        for(int i=0;i<n1;i++){
            if(i%2!=0){
                for(int j=0;j<n2/2;j++){
                  temp=a[i][j];
                  a[i][j]=a[i][n2-j-1];
                  a[i][n2-j-1]=temp;
                }
            }
        }
        printArr(a,n1,n2);
    }
    public static void printArr(int a[][],int n1,int n2) {
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                System.out.print(a[i][j]+" ");
            }
            
        }
        
    }
    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n1=a.length;
        int n2=a[0].length;
        snakePattern(a,n1,n2);
    }
}
