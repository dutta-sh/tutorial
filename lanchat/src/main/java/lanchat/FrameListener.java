package lanchat;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameListener implements WindowListener, KeyListener {
    private final LANChat parent;

    public FrameListener(LANChat parentArg) {
        parent = parentArg;
    }


    public void windowOpened(WindowEvent we) {

    }


    public void windowClosing(WindowEvent we) {
        parent.quit();
    }


    public void windowClosed(WindowEvent we) {

    }


    public void windowIconified(WindowEvent we) {

    }


    public void windowDeiconified(WindowEvent we) {

    }


    public void windowActivated(WindowEvent we) {

    }


    public void windowDeactivated(WindowEvent we) {

    }


    public void keyTyped(KeyEvent ke) {
        parent.keyTyped(ke);
    }


    public void keyPressed(KeyEvent ke) {

    }


    public void keyReleased(KeyEvent ke) {

    }

}