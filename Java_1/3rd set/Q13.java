package Day4;

public class Q13 {
    public static void firstNonRepeatingChar(String s,int n) {
        for(int i=0;i<n;i++){
            int count=0;//count is initialized after for loop because in this string "lekashree" for each value i is set to 0 and then only it increments if found another same woed
            for(int j=0;j<n;j++){
                if(s.charAt(i)==s.charAt(j) && i!=j){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
    public static void main(String[] args) {
        String s="Lekashree";
        int n=s.length();
        firstNonRepeatingChar(s,n);
    }
}
