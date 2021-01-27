package game;

import javax.swing.*;

public class Modal extends JDialog {

    public Modal(JFrame parent, String title, String message) {
        super(parent, title, true);

        JPanel panel = new JPanel();
        JLabel label = new JLabel(message);

        panel.add(label);
        getContentPane().add(panel);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setSize(300,150);

        setVisible(true);
    }

    public static void show(JFrame parent, String title, String message) {
        new Modal(parent, title, message);
    }
}