import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;


public class ClickyButton implements ActionListener {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Number of clicks :");
    JButton button = new JButton("Click me");

    int count;

    // Constructor
    public ClickyButton () {
        panel.setBorder(BorderFactory.createEmptyBorder(100, 50, 10, 50));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);
        panel.add(button);

        button.addActionListener(this);

        // frame.setSize(100, 100);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Clicky");
        frame.pack();
        frame.setVisible(true);

        this.count = 0;
    }

    public static void main(String args[]) {

        new ClickyButton();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.count++;
        this.label.setText(Integer.toString(this.count));

    }
}
