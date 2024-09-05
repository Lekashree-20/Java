package Questions;

// 12345
// 23451
// 34512
// 45123
// 51234

public class QuestionFive {
    public static void main(String[] args){
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
