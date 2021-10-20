package Labs.lab3;

import java.lang.*;

public abstract class Dish {
    String material;
    int volume;

    public Dish() {}
    public String getMaterial() {
        return material;
    }
    public int getVolume() {
        return volume;
    }
    public void setMaterial(String a) {
        material = a;
    }
    public void setVolume(int a) {
        volume = a;
    }
}