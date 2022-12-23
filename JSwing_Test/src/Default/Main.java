package Default;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        MyFrame myFrame = new MyFrame(
                "Frame Title",
                500,
                500
        );

        MyLabel myLabel = new MyLabel(
                "Hello, World!",
                new ImageIcon("JSwing_Test/src/logo.png"),
                100,
                0,
                250,
                250,
                20,
                10
        );

        myFrame.add(myLabel);
    }
}
 