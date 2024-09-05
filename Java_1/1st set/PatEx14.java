package Day2;

public class PatEx14 {
    public static void main(String[] args) {
        int n=6;
        int a=1;
        for(int i=0;i<n;i++){
            
                if(i%2==0){
                    a=3*i+1;
                }
                else{
                    a=i*2;
                }
                System.out.println(" ");
                for(int j=0;j<i+1;j++){
                    System.out.print(a + " ");
                    a++;
                }
                System.out.println();
            }
        }
    
}
