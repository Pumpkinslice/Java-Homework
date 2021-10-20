package Practice.pr7;

import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    static public LinkedList<Integer> fp = new LinkedList();
    static public LinkedList<Integer> sp = new LinkedList();
    static public Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i=0; i != 5; i=i+1) {
            fp.addLast(s.nextInt());
        }
        for (int i=0; i != 6; i=i+1) {
            fp.addLast(-1);
        }
        for (int i=0; i != 5; i=i+1) {
            sp.addLast(s.nextInt());
        }
        for (int i=0; i != 6; i=i+1) {
            sp.addLast(-1);
        }
        boolean turn = true;
        int numTurn = 0;
        while ( !(sp.get(0) == -1 || fp.get(0) == -1 || numTurn == 106) ) {
            numTurn = numTurn + 1;
            if (turn) { //turn of the first player
                turn = false;
                if ((fp.get(0) == 0 && sp.get(0) == 9) || (fp.get(0) > sp.get(0) && !(sp.get(0) == 0 && fp.get(0) == 9))) { //first wins
                    int replace1 = fp.get(0);
                    int replace2 = sp.get(0);
                    fp.remove(0);
                    sp.remove(0);
                    fp.add(0, -1);
                    sp.add(0,-1);
                    int count = 1;
                    while (fp.get(count) != -1) {
                        count = count + 1;
                    }
                    fp.remove(count);
                    fp.add(count, replace1);
                    fp.remove(count+1);
                    fp.add(count+1, replace2);
                }
                else { //second wins
                    int replace1 = sp.get(0);
                    int replace2 = fp.get(0);
                    fp.remove(0);
                    sp.remove(0);
                    fp.add(0, -1);
                    sp.add(0,-1);
                    int count = 1;
                    while (sp.get(count) != -1) {
                        count = count + 1;
                    }
                    sp.remove(count);
                    sp.add(count, replace1);
                    sp.remove(count+1);
                    sp.add(count+1, replace2);
                }
            }
            else { //turn of the second player
                turn = true;
                if ((fp.get(0) == 9 && sp.get(0) == 0) || (fp.get(0) < sp.get(0) && !(sp.get(0) == 9 && fp.get(0) == 0))) { //second wins
                    int replace1 = sp.get(0);
                    int replace2 = fp.get(0);
                    fp.remove(0);
                    sp.remove(0);
                    fp.add(0, -1);
                    sp.add(0,-1);
                    int count = 1;
                    while (sp.get(count) != -1) {
                        count = count + 1;
                    }
                    sp.remove(count);
                    sp.add(count, replace1);
                    sp.remove(count+1);
                    sp.add(count+1, replace2);
                }
                else { //first wins
                    int replace1 = fp.get(0);
                    int replace2 = sp.get(0);
                    fp.remove(0);
                    sp.remove(0);
                    fp.add(0, -1);
                    sp.add(0,-1);
                    int count = 1;
                    while (fp.get(count) != -1) {
                        count = count + 1;
                    }
                    fp.remove(count);
                    fp.add(count, replace1);
                    fp.remove(count+1);
                    fp.add(count+1, replace2);
                }
            }
            System.out.println(fp + " " + sp);
            for (int i=0;i!=10;i=i+1) {
                fp.add(i,fp.get(i+1));
                fp.remove(i+1);
                sp.add(i,sp.get(i+1));
                sp.remove(i+1);
            }
            System.out.println(fp + " " + sp);
        }
        if (numTurn == 106) {
            System.out.println("Botva");
        }
        if (fp.get(0)==-1) {
            System.out.println("Second was victorious, the game was lasting for " + numTurn + " turns");
        }
        else {
            System.out.println("First was victorious, the game was lasting for " + numTurn + " turns");
        }
    }
}
