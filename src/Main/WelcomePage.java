package Main;

import javax.swing.*;
import java.awt.*;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hello");

    WelcomePage(String userID) {

        welcomeLabel.setBounds(110,200,210,35);
        welcomeLabel.setFont(new Font("Ariel",Font.BOLD, 35));
        welcomeLabel.setText("Hello " + userID);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(welcomeLabel);
    }
}
