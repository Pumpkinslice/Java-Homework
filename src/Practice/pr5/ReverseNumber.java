package Practice.pr5;

import java.util.Scanner;

public class ReverseNumber {
    static void reverse(int number) {
        if (number!=0) {
            System.out.println(number%10);
            reverse(number/10);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dissect number: ");
        int goal = scan.nextInt();
        reverse(goal);
    }
}
