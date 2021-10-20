package Practice.pr5;

import java.util.Scanner;

public class Sum {
    static int sumDigit(int number) {
        if (number!=0) {
            return number%10+sumDigit(number/10);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sum of number's digits: ");
        int goal = scan.nextInt();
        System.out.println(sumDigit(goal));
    }
}
