import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator {
    private JFrame frame;
    private JTextField textField;
    private String operator;
    private double num1, num2, result;

    public Calculator() {
        frame = new JFrame("Custom Calculator");
        frame.setSize(350, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(new Color(50, 50, 50));

        textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.BOLD, 24));
        textField.setBackground(Color.BLACK);
        textField.setForeground(Color.GREEN);
        frame.add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));
        panel.setBackground(new Color(50, 50, 50));
        
        String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "C", "=", "+"};
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.setBackground(Color.DARK_GRAY);
            button.setFocusPainted(false);
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            
            if (command.matches("[0-9]") || command.equals(".")) {
                textField.setText(textField.getText() + command);
            } else if (command.equals("C")) {
                textField.setText("");
                num1 = num2 = result = 0;
                operator = "";
            } else if (command.equals("=")) {
                try {
                    num2 = Double.parseDouble(textField.getText());
                    switch (operator) {
                        case "+": result = num1 + num2; break;
                        case "-": result = num1 - num2; break;
                        case "*": result = num1 * num2; break;
                        case "/": 
                            if (num2 == 0) {
                                textField.setText("Error: Division by zero");
                                return;
                            }
                            result = num1 / num2; break;
                    }
                    textField.setText(String.valueOf(result));
                } catch (Exception ex) {
                    textField.setText("Error");
                }
            } else {  // Operator handling
                if (!textField.getText().isEmpty()) {
                    num1 = Double.parseDouble(textField.getText());
                    operator = command;
                    textField.setText("");
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Calculator::new);
    }
}