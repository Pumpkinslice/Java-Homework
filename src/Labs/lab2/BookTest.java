package Labs.lab2;

import java.lang.*;

public class BookTest {
    public static void main(String[] args) {
        Book a = new Book("Dostoevsky", "Crime and punishment", 1800);
        System.out.println("Author=" + a.getAuthor() + " Name=" + a.getName() + " Release date=" + a.getRelease());
    }
}
