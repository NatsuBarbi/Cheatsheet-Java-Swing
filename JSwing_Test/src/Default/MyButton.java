package Default;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton {
    MyButton(String text){
        this.setBounds(200, 100, 200, 50);                              // set Button Size
        this.setText(text);                                             // set Button Text
        this.setHorizontalTextPosition(JButton.CENTER);
        this.setVerticalAlignment(JButton.CENTER);
        this.setFont(new Font("Consolas", Font.BOLD, 25));              // Text Formats
        this.setForeground(Color.red);                                  // Text Color
        this.setBackground(Color.cyan);                                 // Button Background
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3)); // set Border
    }


}
