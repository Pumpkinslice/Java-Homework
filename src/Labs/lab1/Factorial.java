package Labs.lab1;

import java.util.Scanner;

public class Factorial {
    public static int FindFact(int num) {
        int fact=1;
        while (num!=1) {
            fact=fact*num;
            num=num-1;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Type a number to find its factorial");
        int num=inp.nextInt();
        System.out.println("Factorial of the number " + num + " is " + FindFact(num));
    }
}
