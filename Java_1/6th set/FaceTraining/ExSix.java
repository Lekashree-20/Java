package ZohoSet1.FaceTraining;

public class ExSix {
    public static void main(String[] args) {
        String inp = "aaabbcccdddd";
        int i = 0;
        int j = 0;
        while (i < inp.length() && j < inp.length()) {
            // to be implemented
        }
    }
}

/* import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "aaabbaccccdd"; // Removed the array braces

        int sum = 0;
        int count = 1;

        for (int i = 1; i < s.length(); i++) { // Changed loop initialization
            if (s.charAt(i) == s.charAt(i - 1)) { // Used charAt() to access characters
                count += 1;
            } else {
                if (count % 2 == 0) {
                    sum += count;
                }
                count = 1;
            }
        }
        if (count % 2 == 0){
            sum+=count;
        }

        System.out.println(sum);
    }
}
 */
