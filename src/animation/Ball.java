package animation;

import paint.Paintable;

import java.awt.*;

public class Ball implements Paintable {
    private double size;
    private Color  color;
    private Vect2D p;
    private Vect2D v;

    public Ball(double size, Color color, double x, double y, double vx, double vy) {
        this.size = size;
        this.color= color;
        this.p    = new Vect2D(x,y);
        this.v    = new Vect2D(vx,vy);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval((int)(p.x-size/2),(int)(p.y-size/2),(int)size,(int)size);
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Vect2D getP() {
        return p;
    }

    public void setP(Vect2D p) {
        this.p = p;
    }

    public Vect2D getV() {
        return v;
    }

    public void setV(Vect2D v) {
        this.v = v;
    }
}
