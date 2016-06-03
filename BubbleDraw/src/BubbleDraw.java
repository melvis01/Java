import javax.swing.*;

/**
 * Created by Melvision on 09/05/2016.
 */
public class BubbleDraw extends JFrame {
    public static void main(String[] args) {
        // set up our bubble draw App

        JFrame frame = new JFrame("Melvis Bubble Draw App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new BubblePanel());

        frame.pack();
        frame.setVisible(true);
    }
}
