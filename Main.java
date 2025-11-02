import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("تطبيقي الأول");
        JButton button = new JButton("اضغطني");

        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "مرحباً بك!"));

        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
