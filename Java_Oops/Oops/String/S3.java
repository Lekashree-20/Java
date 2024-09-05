package Oops.String;

public class S3 {
    public static void main(String[] args) {
        String w1="Wipro";
        String w2="";
        int n=w1.length();
        char first =w1.charAt(0);
        char second=w1.charAt(1);
        for(int i=0;i<n;i++){
            w2+=first;
            w2+=second;
        }
        System.out.println(w2);
    }
    
}
    

