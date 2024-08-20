import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup{
    public static void main(String[] args) {
        // Create the frame for the signup page
        JFrame frame = new JFrame("Signup Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(5, 2, 10, 10)); // Layout with 5 rows and 2 columns

        // Create labels and text fields for user input
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();
        
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        JPasswordField confirmPasswordField = new JPasswordField();
        
        JButton signupButton = new JButton("Sign Up");
        JButton cancelButton = new JButton("Cancel");

        // Add components to the frame
        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(confirmPasswordLabel);
        frame.add(confirmPasswordField);
        frame.add(signupButton);
        frame.add(cancelButton);

        // Define button actions
        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());

                if (password.equals(confirmPassword)) {
                    // Perform signup logic here (e.g., save user to database)
                    JOptionPane.showMessageDialog(frame, "Signup Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Passwords do not match.");
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the signup window
            }
        });

        // Set the frame visibility
        frame.setVisible(true);
    }
}
