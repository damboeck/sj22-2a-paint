package animation;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Ballspiel extends Animation {

    public Ballspiel(String title, int width, int height) {
        super(title, width, height);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ballspiel("Ballspiel",800,600);
    }

    @Override
    public void paint(Graphics g) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }
}
