package Default;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.BLUE;

public class InitClass implements ActionListener {
    // Declare and Initiate Objects
    MyFrame myFrame = new MyFrame("Frame Title", 750, 750);
    MyLabel myLabel = new MyLabel("Hello, World!", new ImageIcon("JSwing_Test/src/logo.png"), 100, 500, 250, 250, 20, 10);
    MyPanel myPanel = new MyPanel(BLUE, 0, 250, 250, 250);
    MyButton myButton = new MyButton("Click Me");

    // Main Wrapper - Object functionalities
    public InitClass(){
        myFrame.add(myLabel);
        myFrame.add(myPanel);
        myFrame.add(myButton);
        myButton.addActionListener(this);
        /*
            Alternatively with Lamdba Expressions
            myButton.addActionListener(e -> System.out.println("Hallo"));
        */
    }

    // Event Listener for the Button
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("Hello!");
        if(e.getSource() == myButton){
            System.out.println("Success");
            myLabel.setVisible(true);
        }
    }
}



