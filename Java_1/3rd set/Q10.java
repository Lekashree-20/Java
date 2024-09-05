package Day4;

public class Q10 {
    public static void tomatoPotato(int a[][],int n1,int n2,int k ){
        int i,j;
        for( i=0;i<n1;i++){
            for(j=0;j<n2;j++){
                if(k<=5 || k%5==0||k==n1-1){
                    System.out.println("Tomato");
                    return;
                }
                
            }
        }
        System.out.println("Potato");
    }
    public static void main(String[] args) {
        int a[][]={ {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int k=14; 
        int n1=a.length;
        int n2=a[0].length;
        tomatoPotato(a,n1,n2,k); 
    }
}
