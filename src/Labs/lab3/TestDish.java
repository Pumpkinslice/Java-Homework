package Labs.lab3;

import java.lang.*;

public class TestDish {
    public static void main(String[] args) {
        Plate a = new Plate("ceramic", 500);
        Cup b = new Cup("glass", 250);
        System.out.println("Plate: " + a.getMaterial() + " " + a.getVolume() + " Cup: " + b.getMaterial() + " " + b.getVolume());
    }
}
