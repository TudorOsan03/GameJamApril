package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
    final int ogtilesize = 16;
    final int scale = 3;
    final int tilesize = ogtilesize * scale;
    final int screenwidth = tilesize * 16;
    final int screenheight = tilesize * 12;

    keyimput KeyH = new keyimput();
    Thread GameThread;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenwidth, screenheight));
        this.setBackground(Color.blue);
        this.setDoubleBuffered(true);
        this.addKeyListener(KeyH);
        this.setFocusable(true);
    }

    public void GameStartThread() {
        GameThread = new Thread(this);
        GameThread.start();
    }

    @Override
    public void run() {
        while (GameThread != null) {
            update();

            repaint();

        }
    }

    public void update() {
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.red);
        g2.fillRect(100, 100, tilesize, tilesize);
        g2.dispose();
    }
}
