public class LongestCommonsubsequence {
    static int c1=0;
    static int c2=0;
    static int recursive(String s1,String s2,int n1,int n2){
        c1++;
        if(n1<0||n2<0){
            return 0;
        }
        else if(s1.charAt(n1)==s2.charAt(n2)){
            return 1+recursive(s1, s2, n1, n2);
        }
        return Math.max(recursive(s1, s2, n1-1, n2),recursive(s1, s2, n1, n2-1));
    }
    public static void main(String[] args) {
        String s1="AGGTAB";
        String s2="GXTXAYB";
        int n1=s1.length();
        int n2=s2.length();
        int a= recursive(s1,s2,n1,n2);
        System.out.println(a);
          
    }
}
