package Practice.pr5;

import java.util.Scanner;

public class Recursion {
    static void output(int curr, int goal) {
        int a;
        for (a=0; a<curr; a=a+1) {
            if (goal>0) {
                goal=goal-1;
                System.out.println(curr + " ");
            } else {
                return;
            }
        }
        output(curr+1, goal);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Recursive line of ");
        int goal = scan.nextInt();
        output(1, goal);
    }
}
