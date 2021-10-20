package Labs.lab4;

import java.lang.*;

public class PriceTest {
    public static void main(String[] args) {
        RandomObject1 a = new RandomObject1(500);
        RandomObject2 b = new RandomObject2(300);
        System.out.println("First thing's price=" + a.getPrice() + " Second thing's price=" + b.getPrice());
    }
}
