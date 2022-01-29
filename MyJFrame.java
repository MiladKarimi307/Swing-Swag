import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JComponent {

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.add(new MyJFrame());
        window.pack();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(640, 640);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        int R = 255;
        int G = 255;
        int B = 255;

        for (int i = 0; i < getWidth() / 2; i += 10) {
            g2d.setColor(new Color(R, G, B));
            g2d.drawLine(getWidth() / 2, i, (getWidth() / 2) + i, getHeight() / 2);
            g2d.drawLine(getWidth() / 2, i, (getWidth() / 2) - i, getHeight() / 2);
            g2d.drawLine((getWidth() / 2 - i), getHeight() / 2, (getWidth() / 2), (getHeight() - i));
            g2d.drawLine(getWidth() / 2 + i, getHeight() / 2, (getWidth() / 2), (getHeight() - i));
            R -= 5;
            G -= 5;
            B -= 5;
        }
    }
}