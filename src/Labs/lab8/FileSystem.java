package Labs.lab8;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileSystem {
    static public FileWriter writer;
    static public FileReader reader;
    static public Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("(read) (rewrite) (append) (exit)");
        while (true) {
            String line = scan.nextLine();
            if (line.equals("read")) {
                try {
                    reader = new FileReader("C:\\Users\\Anton\\Documents\\Projects Java\\ПнДж 3 семестр\\src\\Labs\\lab8\\Text.txt");
                    System.out.println("Content of the file:");
                    int check = reader.read();
                    while (check != -1) {
                        System.out.println((char)check);
                        check = reader.read();
                    }
                    reader.close();
                } catch (Exception a) {}
            }
            else if (line.equals("rewrite")) {
                try {
                    writer = new FileWriter("C:\\Users\\Anton\\Documents\\Projects Java\\ПнДж 3 семестр\\src\\Labs\\lab8\\Text.txt", false);
                    System.out.println("Write text to replace in file:");
                    String input = scan.nextLine();
                    writer.write(input);
                    writer.close();
                } catch (Exception a) {}
            }
            else if (line.equals("append")) {
                try {
                    writer = new FileWriter("C:\\Users\\Anton\\Documents\\Projects Java\\ПнДж 3 семестр\\src\\Labs\\lab8\\Text.txt", true);
                    System.out.println("Write text to add to file:");
                    String input = scan.nextLine();
                    writer.write(input);
                    writer.close();
                } catch (Exception a) {}
            }
            else if (line.equals("exit")) {
                break;
            }
            else {
                System.out.println("(read) (rewrite) (append) (exit)");
            }
        }
    }
}
