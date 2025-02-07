/*import java.util.Calendar;
import java.util.Date;
import java.util.Calendar;
import java.util.Random;

public class DateExample {
    public static void main(String[] args) {
	//java.Calendar
        Calendar cal = Calendar.getInstance();
        System.out.println("Year: " + cal.get(Calendar.YEAR));
	System.out.println("Months: " + (cal.get(Calendar.MONTH)+1));
	//java.Date;
	Date date = new Date();
	System.out.println(date);
	//java.Random;
	Random rand = new Random();
	System.out.println("The random INT selected by system: " + rand.nextInt(10));
    }
}
*/
import javax.swing.*;

class PasswordGUI {
    public static void main(String[] args) {
        // Predefined correct password
        String correctPassword = "securePass123";

        // Create a JFrame for the GUI window
        JFrame frame = new JFrame("Password Scanner");

        // Create a JLabel to display the prompt
        JLabel label = new JLabel("Enter your password: ");
        
        // Create a JPasswordField to hide password input
        JPasswordField passwordField = new JPasswordField(20);

        // Create a JButton for password submission
        JButton submitButton = new JButton("Submit");

        // Create a JLabel to display the result message
        JLabel resultLabel = new JLabel("");

        // Add action listener to the submit button
        submitButton.addActionListener(e -> {
            // Get entered password from JPasswordField
            char[] enteredPasswordArray = passwordField.getPassword();
            String enteredPassword = new String(enteredPasswordArray);

            // Check if the entered password is correct
            if (enteredPassword.equals(correctPassword)) {
                resultLabel.setText("Welcome user!!");
            } else {
                resultLabel.setText("Wrong password, retry.");
            }
        });

        // Set up the frame layout
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Z_AXIS));
        frame.add(label);
        frame.add(passwordField);
        frame.add(submitButton);
        frame.add(resultLabel);

        // Basic frame setup
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
