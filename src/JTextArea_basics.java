/*                              Java JTextArea
- The object of a JTextArea class is a multi line region that displays text.
- It allows the editing of multiple line text. It inherits JTextComponent class

                            JTextArea class declaration
public class JTextArea extends JTextComponent


                            Commonly used Constructors:
Constructor	                                                    Description
JTextArea()	                                   Creates a text area that displays no text initially.
JTextArea(String s)	                           Creates a text area that displays specified text initially.
JTextArea(int row, int column)	               Creates a text area with the specified number of rows and columns that displays no text initially.
JTextArea(String s, int row, int column)	   Creates a text area with the specified number of rows and columns that displays specified text.

                                Commonly used Methods:
Methods	                                                Description
void setRows(int rows)	                        It is used to set specified number of rows.
void setColumns(int cols)	                    It is used to set specified number of columns.
void setFont(Font f)	                        It is used to set the specified font.
void insert(String s, int position)	            It is used to insert the specified text on the specified position.
void append(String s)	                        It is used to append the given text to the end of the document.*/

//following is an example of JtextArea with ActionListener

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextArea_basics extends JFrame implements ActionListener {
    JTextArea ta;
    JButton b;
    JLabel l1,l2;
    JTextArea_basics(){

        l1=new JLabel();
        l1.setBounds(50,25,100,30);

        l2=new JLabel();
        l2.setBounds(160,25,100,30);

        ta = new JTextArea("Type here and count words and characters");
        ta.setBounds(20,75,250,200);

        b=new JButton("Count Words");
        b.setBounds(100,300,120,30);
        b.addActionListener(this);

        setSize(450,450);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(l1); add(l2); add(ta); add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = ta.getText();
        String words[] = str.split("\\s");
        l1.setText("Words : "+words.length);
        l2.setText("Characters : "+str.length());
    }

    public static void main(String[] args) {
        new JTextArea_basics();
    }

}
