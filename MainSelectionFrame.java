import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainSelectionFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    public MainSelectionFrame() {
        setTitle("Select Functionality");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(2, 1));
        JButton passwordGeneratorButton = new JButton("Password Generator");
        JButton encryptionDecryptionButton = new JButton("Encryption/Decryption");

        passwordGeneratorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PasswordGenerator();
                dispose();
            }
        });

        encryptionDecryptionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EncryptDecrypt();
                dispose();
            }
        });

        panel.add(passwordGeneratorButton);
        panel.add(encryptionDecryptionButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainSelectionFrame();
            }
        });
    }
}
