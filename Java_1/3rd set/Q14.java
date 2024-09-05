package Day4;

public class Q14 {
    public static void reverseString(String s,int n) {
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==' '){
                for(int j=i+1;j<n;j++){
                    if(s.charAt(j)==' ')
                    break;
                    System.out.print(s.charAt(j));

                }
                System.out.print(" "); 
            }
        }
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' ')
               break;
               System.out.print(s.charAt(i)); 
        }
    }
    public static void main(String[] args) {
        String s="Good afternoon to all";
        int n = s.length();
        reverseString(s,n); 
    }
}
