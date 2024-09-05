package Day4;

public class Q2 {
    public static void upperTriangle(int a[][],int n1,int n2) {
        for(int i=0;i<n1;i++){
            for(int j=0;j<i;j++){
                if(a[i][j]!=0){
                    System.out.println("Not an Upper triangular matrix");
                    return;//function execution stops here...if it is not used the loop executes again and again
                }
                
            }
        }
        System.out.println("Upper triangular matrix");
        
    }
    public static void main(String[] args) {
        int a[][]={{1,2,3},{0,5,6},{0,0,9}};
        int n1=a.length;
        int n2=a[0].length;
        upperTriangle(a,n1,n2);
    }
    
}
