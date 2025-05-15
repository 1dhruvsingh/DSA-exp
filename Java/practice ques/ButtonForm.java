import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonForm extends JFrame {
    
    private JLabel messageLabel;
    
    public ButtonForm() {
        // Set up the frame
        setTitle("Button Form");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        // Create components
        JButton submitButton = new JButton("SUBMIT");
        JButton cancelButton = new JButton("CANCEL");
        messageLabel = new JLabel(" ");
        
        // Add action listeners
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("submitted");
            }
        });
        
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("cancelled");
            }
        });
        
        // Add components to frame
        add(submitButton);
        add(cancelButton);
        add(messageLabel);
    }
    
    public static void main(String[] args) {
        // Create and show the form
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ButtonForm form = new ButtonForm();
                form.setVisible(true);
            }
        });
    }
}