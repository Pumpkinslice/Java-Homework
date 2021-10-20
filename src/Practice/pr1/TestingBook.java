package Practice.pr1;

import java.lang.*;

public class TestingBook {
    public static void main(String[] args) {
        Book first = new Book("detective", 200);
        Book second = new Book(150);
        Book third = new Book(300);
        second.SetGenre("horror");
        first.ToString();
        second.ToString();
        third.ToString();
    }
}