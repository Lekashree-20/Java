package Day4;

public class Q3 {
    public static void upperTriangle(int a[][],int n1,int n2) {
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(a[i][j]!=0 && i<j){
                    System.out.println("Not a lower triangular matrix");
                    return;//function execution stops here...if it is not used the loop executes again and again
                }
                
            }
        }
        System.out.println("Lower triangular matrix");
        
    }
    public static void main(String[] args) { 
        int a[][]={{1,0,0},{3,5,0},{7,8,9}};
        int n1=a.length;
        int n2=a[0].length;
        upperTriangle(a,n1,n2);
    }
    
}
