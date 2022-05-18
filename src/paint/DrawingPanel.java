package paint;

import java.awt.*;
import java.util.Vector;

/**
 * Interface für die Eigenschaften einer Zeichenebene auf Basis des AWT
 */
public interface DrawingPanel {

    /** @return liefert die aktuellen Zeichenelemente der Zeichenebene */
    Vector<Paintable> getElements();

    /** @return liefert die aktuelle Zeichenfarbe */
    Color getDrawingColor();

    /** zeichnet die Zeichenebene neu */
    void repaint();

}
