package Practice.pr2;

import java.lang.*;

public class Ball {
    private double x;
    private double y;

    public Ball(double a, double b) {
        x=a;
        y=b;
    }

    public Ball() {
        x=0;
        y=0;
    }

    public double GetX() {
        return x;
    }

    public double GetY() {
        return y;
    }

    public void SetX(double a) {
        x=a;
    }

    public void SetY(double a) {
        y=a;
    }

    public void SetXY(double a, double b) {
        x=a;
        y=b;
    }

    public void Move(double a, double b) {
        x=x+a;
        y=y+b;
    }

    public String ToString() {
        return ("Ball @ (" + x + ", " + y + ")");
    }
}