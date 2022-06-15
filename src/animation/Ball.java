package animation;

import paint.Paintable;

import java.awt.*;

public class Ball implements Paintable, Animateable {
    private double size;
    private Color  color;
    private Vect2D p,palt;
    private Vect2D v,valt;

    public Ball(double size, Color color, double x, double y, double vx, double vy) {
        this.size = size;
        this.color= color;
        this.p    = new Vect2D(x,y);
        this.v    = new Vect2D(vx,vy);
        this.palt = p;
        this.valt = v;
    }

    @Override
    public void calcStep(double dT, Vect2D a) {
        palt = p;
        valt = v;
        p = palt.add(valt.mul(dT));  // palt+valt*dT
        v = valt.add(a.mul(dT));
    }

    @Override
    public void wallVertical(double x) {
        if (v.x>0 && (p.x+size/2)>x && (palt.x+size/2)<=x ) {
            v = new Vect2D(-valt.x*0.98,v.y);
            p = new Vect2D(2*x-p.x-size,p.y);
        } else if (v.x<0 && (p.x-size/2)<x && (palt.x-size/2)>=x) {
            v = new Vect2D(-valt.x*0.98,v.y);
            p = new Vect2D(2*x-p.x+size,p.y);
        }
    }

    @Override
    public void wallHorizontal(double y) {
        if (v.y>0 && (p.y+size/2)>y && (palt.y+size/2)<=y ) {
            v = new Vect2D(v.x,-valt.y*0.98);
            p = new Vect2D(p.x,2*y-p.y-size);
        } else if (v.y<0 && (p.y-size/2)<y && (palt.y-size/2)>=y) {
            v = new Vect2D(v.x,-valt.y*0.98);
            p = new Vect2D(p.x,2*y-p.y+size);
        }
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
