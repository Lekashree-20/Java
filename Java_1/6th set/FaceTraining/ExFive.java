package ZohoSet1.FaceTraining;

public class ExFive {
    public static void main(String[] args) {
        String inp = "(((())))";
        int top = -1;
        char[] array = new char[100];

        for (int i = 0; i < inp.length(); i++) {
            if(i == 0) {
                array[++top] = inp.charAt(i);
            }
            else{
                if(inp.charAt(i) == '('){
                    array[++top] = inp.charAt(i);
                }
                else if(inp.charAt(i) == ')'){
                    if(array[top] == '('){
                        --top;
                    }
                    else{
                        array[++top] = inp.charAt(i);
                    }
                }
            }
        }

        if(top == -1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
