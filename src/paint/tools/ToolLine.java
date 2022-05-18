package paint.tools;

import paint.DrawingPanel;
import paint.Editable;
import paint.elements.Line;

import java.awt.*;
import java.awt.event.MouseEvent;

public class ToolLine extends BaseTool implements Editable {

    private boolean edit=false;

    private Line line=null;

    public ToolLine(Point base) {
        super(base);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.lightGray);
        g.fillRect(base.x,base.y,40,40);
        g.setColor(Color.black);
        g.drawLine(base.x+4,base.y+4,base.x+36,base.y+36);
    }

    @Override
    public void mousePressed(MouseEvent e, DrawingPanel panel) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            edit = true;
            line = new Line(e.getPoint(),panel.getDrawingColor());
            panel.getElements().add(line);
            panel.repaint();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e, DrawingPanel panel) {
        if (e.getButton() == MouseEvent.BUTTON1 && edit) {
            line.setP2(e.getPoint());
            edit=false;
            line=null;
            panel.repaint();
        }
    }

    @Override
    public void mouseDragged(MouseEvent e, DrawingPanel panel) {
        if (edit) {
            line.setP2(e.getPoint());
            panel.repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e, DrawingPanel panel) {

    }
}
