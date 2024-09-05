package Questions;

// 1   5
//  2 4 
//   3  
//  2 4 
// 1   5

public class QuestionFour {
    public static void main(String[] args) {
        String input = "ABCDEFG";
        int length = input.length();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j == i || j == length - i - 1)
                    System.out.print(input.charAt(j));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
