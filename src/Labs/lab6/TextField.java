package Labs.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField extends JFrame {
    public JTextField text = new JTextField(20);
    public JMenu fontMenu = new JMenu(); //"Fonts"
    public JMenu colorMenu = new JMenu(); //"Colors"
    public JMenuBar bar = new JMenuBar();
    public JMenuItem fontTimes = new JMenuItem("Times New Roman");
    public JMenuItem fontsans = new JMenuItem("MS Sans Serif");
    public JMenuItem fontcourier = new JMenuItem("Courier New");
    public JMenuItem colorblue = new JMenuItem("Blue");
    public JMenuItem colorred = new JMenuItem("Red");
    public JMenuItem colorblack = new JMenuItem("Black");

    TextField() {
        super("Menu");
        setLayout(new FlowLayout());
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //fontMenu.setFont(new Font("TimesNewRoman", Font.BOLD, 10));
        //colorMenu.setFont(new Font("TimesNewRoman", Font.BOLD, 10));
        fontMenu.setBounds(0,0,500,200);
        bar.add(fontMenu);
        fontTimes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            }
        });
        fontMenu.add(fontsans);
        fontsans.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
            }
        });
        fontMenu.add(fontcourier);
        fontcourier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("Courier New", Font.PLAIN, 14));
            }
        });
        bar.add(colorMenu);
        colorMenu.add(colorblue);
        colorblue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.BLUE);
            }
        });
        colorMenu.add(colorred);
        colorred.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.RED);
            }
        });
        colorMenu.add(colorblack);
        colorblack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.BLACK);
            }
        });
        setJMenuBar(bar);
        add(text);
    }

    public static void main(String[] args) {
        new TextField();
    }
}
