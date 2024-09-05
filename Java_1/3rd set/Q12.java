package Day4;

public class Q12 {
    public static boolean palindromeString(String s, int n) {
        int i = 0, j = n - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Madam";
        s = s.toLowerCase();
        int n = s.length();
        if (palindromeString(s, n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
