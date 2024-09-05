package LogicBuilding.Day8;

import java.util.Scanner;

public class EvenOdd {
    public static int oddEven(int input1, String input2) {
        int x = input2.length();

        int n = input1;
        int s = 0, s2 = 0;
        if (x == 4) {
            while (n != 0) {
                int temp = n % 10;
                if (temp % 2 == 0) {
                    s = s + temp;
                }
                n /= 10;
            }
            return s;
        } else {
            while (n != 0) {
                int temp = n % 10;
                if (temp % 2 != 0) {
                    s2 = s2 + temp;
                }
                n /= 10;
            }
            return s2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input1 = sc.nextInt();
        System.out.print("Enter a string: ");
        String input2 = sc.next();

        int result = oddEven(input1, input2);
        System.out.println("Result: " + result);

        sc.close();
    }
}
