package Default;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyLabel extends JLabel {

    MyLabel(String text, ImageIcon image, int xPos, int yPos, int width, int height, int fontSize, int gap) {
        Border border = BorderFactory.createLineBorder(Color.cyan);

        this.setText(text);                                         // set label text
        this.setIcon(image);                                        // set icon into label
        this.setHorizontalTextPosition(JLabel.CENTER);              // change textposition Horizontal
        this.setVerticalTextPosition(JLabel.TOP);                   // change textposition Vertical
        this.setForeground(new Color(0x00ff00));                // set text color
        this.setFont(new Font("MV Boli", Font.PLAIN, fontSize)); // set text font + weight + size
        this.setIconTextGap(gap);                                   // set gap of text to image
        this.setBackground(Color.BLACK);                            // set backgroundcolor
        this.setOpaque(true);                                       // display backgroundcolor (Mandatory!)
        this.setBorder(border);                                     // set border
        this.setVerticalAlignment(JLabel.CENTER);                   // set vertical position of label (image+text)
        this.setHorizontalAlignment(JLabel.CENTER);                 // set horizontal position of label (image+text)
        this.setBounds(xPos, yPos, width, height);                  // set x,y position + dimensions/scale within frame
        this.setVisible(false);
    }
}
