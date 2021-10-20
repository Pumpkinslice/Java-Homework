package Practice.pr3;

import java.lang.*;

public class Point implements Movable{
    public int x, y, xSpeed, ySpeed;

    public Point(int a, int b, int c, int d) {
        x=a;
        y=b;
        xSpeed=c;
        ySpeed=d;
    }
    public String toString() {
        return ("x=" + x + " y=" + y + " xSpeed=" + xSpeed + " ySpeed=" + ySpeed);
    }
    public void MoveUp() {}
    public void MoveLeft() {}
    public void MoveRight() {}
    public void MoveDown() {}
}
