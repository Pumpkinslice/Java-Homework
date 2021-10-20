package Practice.pr1;

import java.lang.*;

public class Book {
    private String genre;
    private int amount_pages;

    public Book(String a, int b) {
        genre=a;
        amount_pages=b;
    }

    public Book(int b) {
        genre="unknown";
        amount_pages=b;
    }

    public void SetGenre(String a) {
        genre=a;
    }

    public void SetPages(int a) {
        amount_pages=a;
    }

    public String GetGenre() {
        return genre;
    }

    public int GetPages() {
        return amount_pages;
    }

    public void ToString() {
        System.out.println("It's a " + genre + " book with " + amount_pages + " pages.");
    }
}