package paint.elements;

import java.awt.*;

public class Line extends Element2P {

    public Line(Point p1, Point p2, Color color) {
        super(p1, p2, color);
    }

    public Line(Point p, Color color) {
        super(p, color);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.drawLine(p1.x,p1.y,p2.x,p2.y);
    }

}
