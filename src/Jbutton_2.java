//Java Jbutton example with ActionListner

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jbutton_2 extends JFrame {
    JTextField tf;
    JButton b;
    JLabel l;
    int count = 1;

    Jbutton_2() {
        tf = new JTextField("Times Clicked : 0");
        tf.setBounds(50, 50, 150, 30);

        b = new JButton("Click Here");
        b.setBounds(50, 100, 95, 30);

        l = new JLabel("Times Clicked : 0");
        l.setBounds(50, 140, 150, 30);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Times Clicked : " + count);
                l.setText("Times Clicked : " + count);
                count++;
            }
        });

        setSize(300,300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(tf); add(b); add(l);
    }

    public static void main(String[] args) {
        new Jbutton_2();
    }
}
