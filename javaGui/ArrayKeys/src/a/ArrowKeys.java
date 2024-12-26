package a;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArrowKeys extends JFrame {
    private JTextArea textArea;//ai generated

    public ArrowKeys() {
        setTitle("Text Entry GUI");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.setLineWrap(true);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String enteredText = textArea.getText();
                System.out.println("You entered: " + enteredText);
                
            }
        });

        JPanel panel = new JPanel();
        panel.add(textArea);
        panel.add(submitButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ArrowKeys());
    }
}
