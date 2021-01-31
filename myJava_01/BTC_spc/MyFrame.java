package BTC_spc;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyFrame extends JFrame{
    MyFrame()
    {
        ImageIcon icon = new ImageIcon("bitcoinicon.png"); // load the image icon
        
        this.setVisible(true); // Set window to be visible
        this.setSize(420,420); // Set window's size x dinension and y dimension
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of the application when press X button
        this.setResizable(false); // prevent window from being resize 
        this.setIconImage(icon.getImage()); // set window's icon
        this.getContentPane().setBackground(new Color(110,110,110)); // Change Color of Background
        
    }
}
