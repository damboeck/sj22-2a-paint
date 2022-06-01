package animation;

import paint.Fenster;

import java.awt.*;

public abstract class Animation extends Fenster implements Runnable {

    public Animation(String title, int width, int height) {
        super(title, width, height);
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) { }
            repaint();
        }
    }

    /** zeichnet das Fenster in einem Frame-Buffer neu */
    @Override
    public void update(Graphics g) {
        Image dbImage;
        dbImage     = this.createImage(this.getSize().width,this.getSize().height);
        paint(dbImage.getGraphics());
        g.drawImage(dbImage,0,0, this);
    }

}
