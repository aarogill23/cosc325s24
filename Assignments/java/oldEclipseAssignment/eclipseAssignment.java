import javax.swing.*;
import java.awt.*;
public class eclipseAssignment extends JFrame{
    public static void main(String[] args){
        eclipseDetector dectection = new eclipseDetector();
        JFrame frame = new JFrame("Eclipse Detector");
        JButton forwardButton = new JButton("Forward");
        JButton pausePlay = new JButton("Pause/Play");
        JButton backButton = new JButton("Step Backwards");

        forwardButton.setBounds(50,250,220,50);
        pausePlay.setBounds(270,250,220,50);
        backButton.setBounds(490,250,220,50);

        frame.add(forwardButton);
        frame.add(pausePlay);
        frame.add(backButton);
        frame.setSize(1000,600);
        frame.setLayout(null);
        frame.setVisible(true);
       drawSun(frame.getGraphics());
    }

    public static void drawSun(Graphics g){
        g.drawOval(500, 300, 100, 100);
    }
}