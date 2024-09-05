package Day2;
//nop
public class PEx17 {
    public static void main(String[] args) {
       
        int[] a={3,2,1,2,4};
        //op:{3,2,1,4}
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int count=0;
            for(int j=0;j<n;j++){
              
                if(a[i]==a[j]){
                  count=1;
                  break;
                }
            }
            
          
        }

    }
}
    

