package Practice.pr3;

import java.lang.*;

public class Circle implements Movable {
    public int radius;
    public Point center;

    public Circle(int a, int b, int c, int d, int e) {
        center=new Point(a, b, c, d);
        radius=e;
    }
    public String toString(){
        return ("radius=" + radius + " " + center.toString());
    }
    public void MoveUp() {}
    public void MoveLeft() {}
    public void MoveRight() {}
    public void MoveDown() {}

    public static void main(String[] args) {
        Circle a = new Circle(1, 2,3,4,5);
        System.out.println(a.toString());
    }
}