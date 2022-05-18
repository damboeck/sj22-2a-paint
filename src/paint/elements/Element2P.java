package paint.elements;

import paint.Paintable;

import java.awt.*;

public abstract class Element2P implements Paintable {

    /** erster Punkt */
    protected Point p1;

    /** zweiter Punkt */
    protected Point p2;

    /** Linienfarbe */
    protected Color color;

    public Element2P(Point p1, Point p2, Color color) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = color;
    }

    public Element2P(Point p, Color color) {
        this(p,p,color);
    }

    public void setP2(Point p) {
        p2 = p;
    }

}
