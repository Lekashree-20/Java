package ZohoSet1.FaceTraining;

public class ExEight {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;
        while(n != 1){
            if(n%2 == 0){
                n = n/2;
                count++;
            }
            else{
                n = (3*(n)) + 1;
                count++;
            }
        }
        System.out.println(count);
    }
}



/* Method2
class HelloWorld {
    public static void main(String[] args) {
        int count1=0,n=7;
        while(n!=1){
            count1+=1;
            if(n%2==0){
                n=n/2;
            }
            else{
                n=3*n+1;
            }
        }
        System.out.println(count1);
    }
} */
