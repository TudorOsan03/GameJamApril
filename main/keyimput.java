package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyimput implements KeyListener {
    public boolean upPressed, downPressed, spacePressed;

    public void KeyPressed(KeyEvent e){
        int code =e.getKeyCode();
        if(code == KeyEvent.VK_W){
            upPressed=true;
        }
        if(code == KeyEvent.VK_S){
            downPressed=true;
        }
        if(code == KeyEvent.VK_SPACE){
            spacePressed=true;
        }

    public void KeyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_W) {
            upPressed = false;
        }
        if (code == KeyEvent.VK_S) {
            downPressed = false;
        }
        if (code == KeyEvent.VK_SPACE) {
            spacePressed = false;
        }
    }

}
