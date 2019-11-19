/*
Java JButton
* The JButton class is used to create a labeled button that has platform independent implementation.
* The application result in some action when the button is pushed.
* It inherits AbstractButton class.

JButton class declaration
* public class JButton extends AbstractButton implements Accessible

Commonly used Constructors:
Constructor	                                    Description
* JButton()	                        It creates a button with no text and icon.
* JButton(String s)	                It creates a button with the specified text.
* JButton(Icon i)               	It creates a button with the specified icon object.

Commonly used Methods of AbstractButton class:
    Methods	                                                    Description
* void setText(String s)	                    It is used to set specified text on button
* String getText()	                            It is used to return the text of the button.
* void setEnabled(boolean b)	                It is used to enable or disable the button.
* void setIcon(Icon b)	                        It is used to set the specified Icon on the button.
* Icon getIcon()	                            It is used to get the Icon of the button.
* void setMnemonic(int a)	                    It is used to set the mnemonic on the button.
* void addActionListener(ActionListener a)	    It is used to add the action listener to this object.*/




//following is a simple jbutton example
import javax.swing.*;

public class Jbutton_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click Me");

        button.setBounds(130,100,100,40);

        frame.setSize(400,300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(button);

    }

}
