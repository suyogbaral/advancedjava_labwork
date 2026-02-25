import java.awt.*;
import javax.swing.*;

public class FrameLab{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form");
        frame.setSize(200, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel l1 = new JLabel("Name:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(l1, gbc);

        JTextField tf1 = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(tf1, gbc);

        JLabel l2 = new JLabel("Class:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(l2, gbc);

        JTextField tf2 = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(tf2, gbc);

        JLabel l3 = new JLabel("Roll No:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(l3, gbc);

        JTextField tf3 = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 2;
        frame.add(tf3, gbc);

        JLabel l4 = new JLabel("DOB:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        frame.add(l4, gbc);

        JTextField tf4 = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 3;
        frame.add(tf4, gbc);

        JButton submit = new JButton("Submit!");
        gbc.gridx = 1;
        gbc.gridy = 4;
        frame.add(submit, gbc);

        JPanel p1 = new JPanel();

        p1.add(new JTextArea("English : 100\nNepali : 99\nMaths : 99"));
        gbc.gridx = 0;
        gbc.gridy = 5;
        frame.add(p1, gbc);

        frame.setVisible(true); //Making frame visible
    }

}
