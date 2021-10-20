package Labs.lab7;

import java.util.LinkedList;
import java.util.Scanner;

public class Link {
    static public LinkedList<Integer> a = new LinkedList();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("(add) (remove) (out) (quit)");
        label:
        while (true) {
            String cho = s.nextLine();
            switch (cho) {
                case "add":
                    a.addLast(s.nextInt());
                    break;
                case "remove":
                    a.remove(s.nextInt());
                    break;
                case "out":
                    System.out.println(a);
                    break;
                case "quit":
                    break label;
                default:
                    System.out.println("(add) (remove) (out) (quit)");
                    break;
            }
        }
    }
}
