package animation;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Date;

public class Uhr extends Animation{

    public Uhr(String title, int width, int height) {
        super(title, width, height);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Uhr("Uhr",600,600);
    }

    @Override
    public void paint(Graphics g) {
        Date date = new Date();
        int s = date.getSeconds();
        double alpha = s*6*Math.PI/180;
        g.drawLine(300,300,300+(int)(Math.sin(alpha)*280),300-(int)(Math.cos(alpha)*280));
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }
}
