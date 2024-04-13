package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
    final int ogtilesize = 16;
    final int scale = 3;
    final int tilesize = ogtilesize * scale;
    final int screenwidth = tilesize * 16;
    final int screenheight = tilesize * 12;

    Thread GameThread;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenwidth, screenheight));
        this.setBackground(Color.blue);
        this.setDoubleBuffered(true);
    }


    public void GameStartThread(){
        GameThread= new Thread(this);
        GameThread.start();
    }

    @Override
    public void run(){
        while (GameThread!=null) {
            
            
        }
    }
}
