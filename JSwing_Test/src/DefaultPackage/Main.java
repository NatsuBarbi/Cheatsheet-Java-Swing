package DefaultPackage;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("src/logo.png");
        Border border = BorderFactory.createLineBorder(Color.green);

        JLabel label = new JLabel();                                 // create label
        label.setText("Hello, World!");                              // set label text
        label.setIcon(image);                                        // set icon into label
        label.setHorizontalTextPosition(JLabel.CENTER);              // change textposition Horizontal
        label.setVerticalTextPosition(JLabel.TOP);                   // change textposition Vertical
        label.setForeground(new Color(0x00ff00));                // set text color
        label.setFont(new Font("MV Boli", Font.PLAIN,50)); // set text font + weight + size
        label.setIconTextGap(40);                                    // set gap of text to image
        label.setBackground(Color.BLACK);                            // set backgroundcolor
        label.setOpaque(true);                                       // display backgroundcolor (Mandatory!)
        label.setBorder(border);                                     // set border
        label.setVerticalAlignment(JLabel.CENTER);                   // set vertical position of label (image+text)
        label.setHorizontalAlignment(JLabel.CENTER);                 // set horizontal position of label (image+text)
        label.setBounds(100,0,250,250);              // set x,y position + dimensions/scale within frame

        MyFrame myFrame = new MyFrame();
        myFrame.add(label);

    }
}
 