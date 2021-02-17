import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    // Data Field
    JFrame frame;
    JTextField textfield;
    JButton[] number = new JButton[10];
    JButton[] fucntionButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel;

    Font myFont = new Font("Ink Free", Font.BOLD, 30);

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    // Constructor
    Calculator() {

        /**
         *   Frame Config
         */
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        frame.setVisible(true);

        /**
         * 
         * 
         * 
         * 
         * 
         * 
         * Text field config.
         */
        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(myFont);
        textfield.setEditable(false);

        // ===========================
        /**
         * 
         * 
         * 
         * 
         * 
         * 
         */
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton= new JButton("Delete");
        clrButton= new JButton("Clear");

        fucntionButtons[0] = addButton;
        fucntionButtons[0] = addButton;
        fucntionButtons[0] = addButton;
        fucntionButtons[0] = addButton;
        fucntionButtons[0] = addButton;
        fucntionButtons[0] = addButton;
        fucntionButtons[0] = addButton;
        fucntionButtons[0] = addButton;

        /**
         * 
         *
         * 
         *  
         * 
         * 
         */

        frame.add(textfield);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
