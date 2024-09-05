package Day5;

public class Q1 {
    public static void subsequence(String s1,String s2,int n1,int n2){
        
        int j=0;
            for(int i=0;i<n1 && j<n2;i++){
                
                    if(s1.charAt(i)==s2.charAt(j)){
                        j++;
                    }
                
                if(j==n2){
                    System.out.println("Yes ");
                    return;
         }
            
      }
        
        System.out.println("No ");
    }
    public static void main(String[] args) {
        String s1="abcde";
        String s2="ace";
        int n1=s1.length();
        int n2=s2.length();
        subsequence(s1,s2,n1,n2);
    }
}
