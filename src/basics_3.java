// We can also extend Jframe class and their is no need to create instance of Jframe class explicitly

import javax.swing.*;

public class basics_3 extends JFrame {
    JFrame f;
    basics_3(){
        JButton button = new JButton("Click Me");
        button.setBounds(130,100,100,40); //x, y, w, h

        setLayout(null);
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        add(button);
    }

    public static void main(String[] args) {
        new basics_3();
    }
}

