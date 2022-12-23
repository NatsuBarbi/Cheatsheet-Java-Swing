package DefaultPackage;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyFrame(String title, int width, int height){
        this.setTitle(title);                                   // set Title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // behaviour on exiting application
        this.setResizable(true);                                // prevent frame from being resized
        this.setSize(width,height);                             // set frame size (x-, y-dimension)
        this.setLayout(null);                                   // seperate frame from label
        this.setVisible(true);                                  // make frame visible

        // ImageIcon image = new ImageIcon("src/logo.png");     // create Image Icon
        // this.setIconImage(image.getImage());                 // change Frame Icon
        // this.getContentPane().setBackground(Color.ORANGE);   // change Background color
    }
}
