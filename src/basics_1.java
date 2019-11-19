/*Their are two ways to create a frame:
 *   1.By creating object of frame class (association)
 *   2.By extending frame class*/

/* following is a simple swing example  where we are creating a button and adding it on the Jframe object
 *  inside the main() method */


import javax.swing.*;

public class basics_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // creating instance of Jframe

        JButton button = new JButton("Click Me");  //creating instance of Jbutton
        button.setBounds(130, 100, 100, 40); //x-axis, y-axis, width, height

        frame.setSize(400, 500);  //width , height
        frame.setLayout(null); //using no layout managers
        frame.setVisible(true); //making frame visible
        frame.add(button); //adding button in Jframe
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
