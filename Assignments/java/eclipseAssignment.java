import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eclipseAssignment extends JFrame {
    private Timer timer;
    private int dayCounter;

    public eclipseAssignment() {
        setTitle("Orbit Simulation");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel controlPanel = new JPanel();
        JButton playButton = new JButton("Play");
        JButton pauseButton = new JButton("Pause");
        JButton stepButton = new JButton("Step");
        JLabel dayLabel = new JLabel("Day: 0");

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.start();
            }
        });

        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });

        stepButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                simulateOneDay();
            }
        });

        controlPanel.add(playButton);
        controlPanel.add(pauseButton);
        controlPanel.add(stepButton);
        controlPanel.add(dayLabel);

        add(controlPanel, BorderLayout.SOUTH);

        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                simulateOneDay();
            }
        });

        setVisible(true);
    }

    private void simulateOneDay() {
        // Perform simulation logic here

        // Increment day counter
        dayCounter++;

        // Update day label
        // dayLabel.setText("Day: " + dayCounter);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new eclipseAssignment();
            }
        });
    }
}