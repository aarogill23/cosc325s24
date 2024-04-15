import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eclipseAssignment extends JPanel implements ActionListener {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int SUN_RADIUS = 30;
    private static final int EARTH_RADIUS = 10;
    private static final int MOON_RADIUS = 5;
    private static final double EARTH_ORBIT_RADIUS = 150;
    private static final double MOON_ORBIT_RADIUS = 50;
    private static final double EARTH_ORBIT_SPEED = (0.01); // radians per frame
    private static final double MOON_ORBIT_SPEED = 0.03;

    private double earthAngle = 0;
    private double moonAngle = 0;
    private int dayCounter = 0;
    private boolean isPlaying = false;
    private Timer timer;

    public eclipseAssignment() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        timer = new Timer(20, this);

        JButton playButton = new JButton("Play");
        JButton pauseButton = new JButton("Pause");
        JButton stepButton = new JButton("Step");

        playButton.addActionListener(e -> {
            isPlaying = true;
            timer.start();
        });

        pauseButton.addActionListener(e -> {
            isPlaying = false;
            timer.stop();
        });

        stepButton.addActionListener(e -> {
            if (!isPlaying) {
                stepSimulation();
            }
        });

        add(playButton);
        add(pauseButton);
        add(stepButton);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw Sun
        g.setColor(Color.YELLOW);
        g.fillOval(WIDTH / 2 - SUN_RADIUS, HEIGHT / 2 - SUN_RADIUS, SUN_RADIUS * 2, SUN_RADIUS * 2);

        // Draw Earth
        int earthX = (int) (WIDTH / 2 + EARTH_ORBIT_RADIUS * Math.cos(earthAngle) - EARTH_RADIUS);
        int earthY = (int) (HEIGHT / 2 + EARTH_ORBIT_RADIUS * Math.sin(earthAngle) - EARTH_RADIUS);
        g.setColor(Color.BLUE);
        g.fillOval(earthX, earthY, EARTH_RADIUS * 2, EARTH_RADIUS * 2);

        // Draw Moon
        int moonX = (int) (earthX + MOON_ORBIT_RADIUS * Math.cos(moonAngle) - MOON_RADIUS);
        int moonY = (int) (earthY + MOON_ORBIT_RADIUS * Math.sin(moonAngle) - MOON_RADIUS);
        g.setColor(Color.GRAY);
        g.fillOval(moonX, moonY, MOON_RADIUS * 2, MOON_RADIUS * 2);

        // Draw day counter
        g.setColor(Color.BLACK);
        g.drawString("Day: " + dayCounter, 10, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (isPlaying) {
            updateSimulation();
            repaint();
        }
    }

    private void updateSimulation() {
        earthAngle += EARTH_ORBIT_SPEED;
        moonAngle += MOON_ORBIT_SPEED;
        dayCounter++;
    }

    private void stepSimulation() {
        updateSimulation();
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Orbit Simulation");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new eclipseAssignment(), BorderLayout.CENTER);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
