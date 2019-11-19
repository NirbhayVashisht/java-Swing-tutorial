/*                                  Java JLabel
- The object of JLabel class is a component for placing text in a container.
- It is used to display a single line of read only text.
- The text can be changed by an application but a user cannot edit it directly.
- It inherits JComponent class.
*/

/*
                                    JLabel class declaration
Let's see the declaration for javax.swing.JLabel class.
public class JLabel extends JComponent implements SwingConstants, Accessible
*/

/*                                  Commonly used Constructors:

Constructor	                                Description
JLabel()	                        Creates a JLabel instance with no image and with an empty string for the title.
JLabel(String s)	                Creates a JLabel instance with the specified text.
JLabel(Icon i)	                    Creates a JLabel instance with the specified image.
JLabel(String s, Icon i, int horizontalAlignment)	Creates a JLabel instance with the specified text, image, and horizontal alignment.
*/

/*                                      Commonly used Methods:

Methods     	                                    Description
String getText()	                        It returns the text string that a label displays.
void setText(String text)	                It defines the single line of text this component will display.
void setHorizontalAlignment(int alignment)	It sets the alignment of the label's contents along the X axis.
Icon getIcon()                          	It returns the graphic image that the label displays.
int getHorizontalAlignment()	            It returns the alignment of the label's contents along the X axis.*/

//following is an example of Jlabel with ActionListner

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jlabel_basics extends JFrame/* implements ActionListener*/ {
    JLabel l;
    JButton b;
    JTextField t;
    int count = 1;
    Jlabel_basics(){
        l = new JLabel("We will count number of clicks");
        l.setBounds(70,30,200,20);

        b = new JButton("Click Me");
        b.setBounds(80,60,90,30);

        t = new JTextField("You have clicked 0 times");
        t.setBounds(60,100,150,20);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText("You have clicked "+count+" times");
                count++;
            }
        });

        setSize(300,300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(l); add(b); add(t);
    }
    public static void main(String[] args) {
        new Jlabel_basics();
    }
}
