package Day2;

public class PatEx12 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int n=a.length;
        int i,j;
        for(i=0;i<n;i++){
            a[i]=i+1;
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j){
                    System.out.print(a[i]+"  ");
                    
                    
                }
                else if(j==(n-i-1)){
                    System.out.print(a[n-i-1]+"  ");
                    
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println(); 
        }
        
}
}
 