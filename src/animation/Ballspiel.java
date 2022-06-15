package animation;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Ballspiel extends Animation {

    Ball ball;
    long takt;

    public Ballspiel(String title, int width, int height) {
        super(title, width, height);
        ball = new Ball(50,Color.red,100,300,0.5,-0.2);
        takt = System.currentTimeMillis();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ballspiel("Ballspiel",800,600);
    }

    @Override
    public void paint(Graphics g) {
        // Physik berechnen
        long talt = takt;
        takt = System.currentTimeMillis();
        long dT = takt-talt;
        Vect2D a = new Vect2D(0,0.0004);

        ball.calcStep(dT,a);
        // Wände
        ball.wallVertical(0);
        ball.wallVertical(getWidth());
        ball.wallHorizontal(getHeight());
        // Darstellung
        ball.paint(g);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }
}
