package paint;

import java.awt.event.MouseEvent;

public interface Editable {

    void mousePressed(MouseEvent e , DrawingPanel panel);
    void mouseReleased(MouseEvent e, DrawingPanel panel);
    void mouseDragged(MouseEvent e , DrawingPanel panel);
    void mouseMoved(MouseEvent e   , DrawingPanel panel);

}
