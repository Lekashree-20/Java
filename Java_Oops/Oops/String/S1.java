package Oops.String;

public class S1 {
    public static void main(String[] args) {
        String Word="mam";
        String Word2="";
        int n=Word.length();
        for(int i=n-1;i>=0;i--){
            Word2=Word2+(Word.charAt(i));
        }
        if(Word2.equals(Word)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
