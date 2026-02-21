package Assignment_8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class DodgeBombKnifeGame extends JPanel implements KeyListener, Runnable {

    // Player
    private int px = 250, py = 300;
    private final int SIZE = 40;
    private final int SPEED = 5;

    private boolean up, down, left, right;

    private Random rand = new Random();
    private java.util.List<Hazard> hazards = new ArrayList<>();

    private boolean running = true;
    private boolean gameOver = false;

    private long startTime = System.currentTimeMillis();
    private int level = 1;

    private Thread gameThread;

    // ---------- HAZARD SYSTEM ----------
    abstract class Hazard {
        int x, y, w, h, speedX, speedY;
        abstract void update();
        abstract void draw(Graphics g);
    }

    // Bomb: straight fall
    class Bomb extends Hazard {
        Bomb(int x) {
            this.x = x;
            this.y = 0;
            this.w = 30;
            this.h = 30;
            this.speedY = 2 + level * 2;
        }

        void update() { y += speedY; }

        void draw(Graphics g) {
            g.setColor(Color.ORANGE);
            g.fillOval(x, y, w, h);
            g.setColor(Color.BLACK);
            g.drawString("B", x+10, y+20);
        }
    }

    // Knife: diagonal motion
    class Knife extends Hazard {
        Knife(int x) {
            this.x = x;
            this.y = 0;
            this.w = 50;
            this.h = 20;
            this.speedY = 3 + level * 2;
            this.speedX = rand.nextBoolean() ? 2 + level : -2 - level;
        }

        void update() {
            x += speedX;
            y += speedY;
        }

        void draw(Graphics g) {
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(x, y, w, h);
        }
    }

    // ---------- CONSTRUCTOR ----------
    public DodgeBombKnifeGame() {
        setPreferredSize(new Dimension(600, 400));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);

        gameThread = new Thread(this);
        gameThread.start();
    }

    // ---------- GAME LOOP ----------
    public void run() {
        while (running) {

            if (!gameOver) {
                updateLevel();
                updatePlayer();
                spawnHazards();
                updateHazards();
                checkCollision();
            }

            repaint();

            try { Thread.sleep(16); } catch (Exception e) {}
        }
    }

    // ---------- LEVEL SYSTEM ----------
    private void updateLevel() {
        int seconds = (int)((System.currentTimeMillis() - startTime)/1000);

        if (seconds > 30) level = 3;
        else if (seconds > 15) level = 2;
        else level = 1;
    }

    // ---------- PLAYER ----------
    private void updatePlayer() {
        if (up) py -= SPEED;
        if (down) py += SPEED;
        if (left) px -= SPEED;
        if (right) px += SPEED;

        px = Math.max(0, Math.min(px, getWidth() - SIZE));
        py = Math.max(0, Math.min(py, getHeight() - SIZE));
    }

    // ---------- SPAWN ----------
    private void spawnHazards() {
        int spawnRate = 40 - level * 10; // faster spawn each level

        if (rand.nextInt(spawnRate) == 0) {
            if (rand.nextBoolean())
                hazards.add(new Bomb(rand.nextInt(getWidth()-40)));
            else
                hazards.add(new Knife(rand.nextInt(getWidth()-60)));
        }
    }

    // ---------- UPDATE ----------
    private void updateHazards() {
        for (Hazard h : hazards) h.update();
        hazards.removeIf(h -> h.y > getHeight()+50 || h.x < -50 || h.x > getWidth()+50);
    }

    // ---------- COLLISION ----------
    private void checkCollision() {
        Rectangle player = new Rectangle(px, py, SIZE, SIZE);

        for (Hazard h : hazards) {
            Rectangle r = new Rectangle(h.x, h.y, h.w, h.h);
            if (player.intersects(r)) {
                gameOver = true;
                break;
            }
        }
    }

    // ---------- RENDER ----------
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Player
        g.setColor(Color.GREEN);
        g.fillRect(px, py, SIZE, SIZE);

        // Hazards
        for (Hazard h : hazards) h.draw(g);

        // HUD
        g.setColor(Color.WHITE);
        g.drawString("Level: " + level, 10, 20);

        int time = (int)((System.currentTimeMillis()-startTime)/1000);
        g.drawString("Time: " + time, 10, 35);

        if (gameOver) {
            g.setFont(new Font("Arial", Font.BOLD, 40));
            g.drawString("GAME OVER", 170, 200);
        }
    }

    // ---------- INPUT ----------
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W: case KeyEvent.VK_UP: up = true; break;
            case KeyEvent.VK_S: case KeyEvent.VK_DOWN: down = true; break;
            case KeyEvent.VK_A: case KeyEvent.VK_LEFT: left = true; break;
            case KeyEvent.VK_D: case KeyEvent.VK_RIGHT: right = true; break;
        }
    }

    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W: case KeyEvent.VK_UP: up = false; break;
            case KeyEvent.VK_S: case KeyEvent.VK_DOWN: down = false; break;
            case KeyEvent.VK_A: case KeyEvent.VK_LEFT: left = false; break;
            case KeyEvent.VK_D: case KeyEvent.VK_RIGHT: right = false; break;
        }
    }

    public void keyTyped(KeyEvent e) {}

    // ---------- MAIN ----------
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bomb & Knife Dodge");
        frame.add(new DodgeBombKnifeGame());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
