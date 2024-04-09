package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
    final int ogtilesize = 16;
    final int scale = 3;
    final int tilesize = ogtilesize * scale;
    final int screenwidth = tilesize * 16;
    final int screenheight = tilesize * 12;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenwidth, screenheight));
        this.setBackground(Color.blue);
        this.setDoubleBuffered(true);
    }

}
