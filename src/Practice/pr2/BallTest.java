package Practice.pr2;

import java.lang.*;

public class BallTest {
    public static void main(String[] args) {
        Ball first = new Ball(12.3, 33.4);
        Ball second = new Ball();
        second.SetXY(50.0, 8.2);
        System.out.println(first.ToString());
        System.out.println(second.ToString());
    }
}