package Day4;

public class Test1 {
    public static void snakePatTest(int a[][],int n1,int n2) {
        for(int i=0;i<n1/2;i++){
            for(int j=0;j<n2;j++){
                if(j%2!=0){
                    int temp=a[i][j];
                    a[i][j]=a[n2-i-1][j];
                    a[n2-i-1][j]=temp;
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
        snakePatTest(a,n1,n2);
    }
}
