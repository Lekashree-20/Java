package FlowControl;

public class Thirteen {
    
    public static void main(String[] args) {
        
        int n;
        int i;
        for(n=10;n<100;n++){
            boolean prime=true;
            for(i=2;i<=n/2;i++){
                if(n%i==0){
                    prime=false;
                    break;
                }
            }
            if(prime){
                    System.out.println(n);
                }
            }
        }
}

