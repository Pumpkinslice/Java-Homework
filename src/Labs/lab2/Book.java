package Labs.lab2;

import java.lang.*;

public class Book {
    String author;
    String name;
    int release;

    public Book(String a, String b, int c) {
        author=a;
        name=b;
        release=c;
    }
    public String getAuthor(){
        return author;
    }
    public int getRelease(){
        return release;
    }
    public String getName(){
        return name;
    }
    public void setAuthor(String a) {
        author=a;
    }
    public void setName(String a) {
        name=a;
    }
    public void setRelease(int a) {
        release=a;
    }
}
