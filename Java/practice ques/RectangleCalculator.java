import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RectangleCalculator extends JFrame {
    private JTextField lengthField, widthField, areaField, perimeterField;
    
    public RectangleCalculator() {
        // Set up the main frame
        setTitle("Area and Perimeter of Rectangle");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));
        
        // Create components
        JLabel titleLabel = new JLabel("Area and Perimeter of Rectangle", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        
        JLabel lengthLabel = new JLabel("Enter Length:");
        lengthField = new JTextField();
        
        JLabel widthLabel = new JLabel("Enter Width:");
        widthField = new JTextField();
        
        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new CalculateHandler());
        
        JLabel areaLabel = new JLabel("Area is:");
        areaField = new JTextField();
        areaField.setEditable(false);
        
        JLabel perimeterLabel = new JLabel("Perimeter is:");
        perimeterField = new JTextField();
        perimeterField.setEditable(false);
        
        // Add components to frame
        add(titleLabel);
        add(new JLabel()); // Empty cell for layout
        add(lengthLabel);
        add(lengthField);
        add(widthLabel);
        add(widthField);
        add(new JLabel()); // Empty cell for layout
        add(calculateButton);
        add(areaLabel);
        add(areaField);
        add(perimeterLabel);
        add(perimeterField);
        
        // Add padding around components
        ((JComponent) getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }
    
    private class CalculateHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                // Get input values
                double length = Double.parseDouble(lengthField.getText());
                double width = Double.parseDouble(widthField.getText());
                
                // Validate inputs
                if (length <= 0 || width <= 0) {
                    throw new IllegalArgumentException("Length and width must be positive numbers");
                }
                
                // Calculate area and perimeter
                double area = length * width;
                double perimeter = 2 * (length + width);
                
                // Display results
                areaField.setText(String.format("%.2f", area));
                perimeterField.setText(String.format("%.2f", perimeter));
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(RectangleCalculator.this,
                    "Please enter valid numbers for length and width",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(RectangleCalculator.this,
                    ex.getMessage(),
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RectangleCalculator calculator = new RectangleCalculator();
            calculator.setVisible(true);
        });
    }
}