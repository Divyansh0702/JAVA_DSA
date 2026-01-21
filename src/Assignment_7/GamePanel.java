package Assignment_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * A simple GamePanel that moves a rectangle with arrow keys.
 * This can be extended for more complex games.
 */
public class GamePanel extends JPanel implements Runnable, KeyListener {

    // Game loop variables
    private Thread gameThread;
    private boolean running = false;

    // Player properties
    private int playerX = 50;
    private int playerY = 50;
    private final int playerSize = 40;
    private final int playerSpeed = 5;

    // Key states
    private boolean up, down, left, right;

    public GamePanel() {
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);
    }

    // Start the game loop
    public void startGame() {
        if (gameThread == null || !running) {
            running = true;
            gameThread = new Thread(this);
            gameThread.start();
        }
    }

    @Override
    public void run() {
        // Basic game loop: update → repaint → sleep
        while (running) {
            updateGame();
            repaint();
            try {
                Thread.sleep(1); // ~60 FPS
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // Update game logic
    private void updateGame() {
        if (up) playerY -= playerSpeed;
        if (down) playerY += playerSpeed;
        if (left) playerX -= playerSpeed;
        if (right) playerX += playerSpeed;

        // Keep player inside the panel
        playerX = Math.max(0, Math.min(playerX, getWidth() - playerSize));
        playerY = Math.max(0, Math.min(playerY, getHeight() - playerSize));
    }

    // Draw game objects
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(playerX, playerY, playerSize, playerSize);
    }

    // KeyListener methods
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP -> up = true;
            case KeyEvent.VK_DOWN -> down = true;
            case KeyEvent.VK_LEFT -> left = true;
            case KeyEvent.VK_RIGHT -> right = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP -> up = false;
            case KeyEvent.VK_DOWN -> down = false;
            case KeyEvent.VK_LEFT -> left = false;
            case KeyEvent.VK_RIGHT -> right = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used
    }

    // Main method to run the panel in a JFrame
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Game Panel Example");
            GamePanel gamePanel = new GamePanel();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(gamePanel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            gamePanel.startGame();
        });
    }
}
