package animation;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Ballspiel extends Animation {

    Ball ball;

    public Ballspiel(String title, int width, int height) {
        super(title, width, height);
        ball = new Ball(50,Color.red,100,100,20,5);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ballspiel("Ballspiel",800,600);
    }

    @Override
    public void paint(Graphics g) {
        // Physik berechnen
        ball.setP(ball.getP().add(ball.getV()));
        // Wände
        if (ball.getP().x>800-ball.getSize()/2) ball.setV(new Vect2D(-ball.getV().x,ball.getV().y));
        if (ball.getP().x<ball.getSize()/2) ball.setV(new Vect2D(-ball.getV().x,ball.getV().y));
        if (ball.getP().y>600-ball.getSize()/2) ball.setV(new Vect2D(ball.getV().x,-ball.getV().y));
        if (ball.getP().y<ball.getSize()/2) ball.setV(new Vect2D(ball.getV().x,-ball.getV().y));
        // Darstellung
        ball.paint(g);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }
}
