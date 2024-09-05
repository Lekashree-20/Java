package ZohoSet1.FaceTraining;

public class ExFour {

    static boolean isVow(char c){
        if("aeiouAEIOU".indexOf(c) != -1)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "Computer";
        String remstr = "";

        for(int i = 0 ; i<str.length() ; i++){
            if(!(isVow(str.charAt(i)))){
                remstr = remstr+str.charAt(i);
            }
        }

        System.out.println(remstr);
    }
}
