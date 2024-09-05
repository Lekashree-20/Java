package Oops.String;

public class S7 {
    
    public static void main(String[] args) {
        String w1="xHix";
        String w2="";
      
        int n=w1.length();
        if(w1.charAt(0)=='x' && w1.charAt(n-1)=='x'){
            for(int i=1;i<n-1;i++){
                w2+=w1.charAt(i);
            }
            System.out.println(w2);
        }
        
        if(w1.charAt(0)!='x' && w1.charAt(n-1)!='x'){
            for(int i=0;i<n;i++){
                w2+=w1.charAt(i);
            }
            System.out.println(w2);
        }
        
        
    }
}
    

