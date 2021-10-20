package Practice.pr4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballTeams extends JFrame {
    int scoreMilan=0;
    int scoreMadrid=0;
    JButton b1 = new JButton("AC Milan");
    JButton b2 = new JButton("Real Madrid");
    JLabel l1 = new JLabel("Result: 0X0");
    JLabel l2 = new JLabel("Last scorer: N/A");
    JLabel l3 = new JLabel("Winner: DRAW");

    FootballTeams() {
        super("SomethingSomething");
        setLayout(new GridLayout(5,1));
        setSize(200,250);
        add(l1);
        add(l2);
        add(l3);
        add(b1);
        add(b2);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMilan=scoreMilan+1;
                l2.setText("Last scorer: AC Milan");
                l1.setText("Result: " + scoreMilan + "X" + scoreMadrid);
                if (scoreMilan>scoreMadrid) {
                    l3.setText("Winner: AC Milan");
                } else if (scoreMilan==scoreMadrid) {
                    l3.setText("Winner: DRAW");
                } else {
                    l3.setText("Winner: Real Madrid");
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMadrid=scoreMadrid+1;
                l2.setText("Last scorer: Real Madrid");
                l1.setText("Result: " + scoreMilan + "X" + scoreMadrid);
                if (scoreMilan>scoreMadrid) {
                    l3.setText("Winner: AC Milan");
                } else if (scoreMilan==scoreMadrid) {
                    l3.setText("Winner: DRAW");
                } else {
                    l3.setText("Winner: Real Madrid");
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new FootballTeams();
    }
}