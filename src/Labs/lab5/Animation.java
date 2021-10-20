package Labs.lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Animation extends JFrame {
    public BufferedImage[] draw = new BufferedImage[4];
    public int count=0;

    Animation() {
        super("Vibing");
        setLayout(new FlowLayout());
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        File file = new File("C:\\Users\\Anton\\Documents\\Projects Java\\ПнДж 3 семестр\\src\\Labs\\lab5\\frame1.jpg");
        try {
            draw[0] = ImageIO.read(file);
            draw[2] = ImageIO.read(file);
            file = new File("C:\\Users\\Anton\\Documents\\Projects Java\\ПнДж 3 семестр\\src\\Labs\\lab5\\frame2.jpg");
            draw[1] = ImageIO.read(file);
            file = new File("C:\\Users\\Anton\\Documents\\Projects Java\\ПнДж 3 семестр\\src\\Labs\\lab5\\frame3.jpg");
            draw[3] = ImageIO.read(file);
        } catch(Exception e) {}
        setVisible(true);
        while (true) {
            Graphics g = getGraphics();
            g.drawImage(draw[count], 0, 0, 500, 500, null);
            try {
                Thread.sleep(400);
            } catch(InterruptedException e) {}
            if (count==3) {
                count=0;
            } else {
                count=count+1;
            }
        }
    }

    public static void main(String[] args) {
        new Animation();
    }
}