package Default;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    MyPanel(Color color, int xPos, int yPos, int width, int height) {
        this.setBackground(color);                                      // Hintergrundfarbe
        this.setBounds(xPos, yPos, width, height);                      // Größe/Position
    }
}
