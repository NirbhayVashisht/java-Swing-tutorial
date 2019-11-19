//We can also write codes of creating Jframe, Jbutton and method call inside a Java constructor


import javax.swing.*;

public class basics_2 {
    JFrame frame;
    basics_2(){
        frame = new JFrame(); // creating instance of Jframe
        JButton button = new JButton("Click Me");// creating instance of Jbutton
        button.setBounds(130,100,100,40); //x, y, w, h

        frame.setSize(400,500); //w, h
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(button);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new basics_2();
    }
}
