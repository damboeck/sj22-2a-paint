package paint;

import paint.tools.BaseTool;
import paint.tools.ToolLine;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class MiniPaint extends Fenster implements DrawingPanel {

    /* --------------------------------------------------------------------------
              Eigenschaften
       -------------------------------------------------------------------------- */
    /** Alle Werkzeugelemente des Programms */
    Vector<BaseTool> tools;
    /** aktuelles Werkzeug */
    BaseTool actualTool;
    /** Alle Zeichen-Elemente der Zeichenebene */
    Vector<Paintable> elements;


    /* --------------------------------------------------------------------------
              Contructor und Main
       -------------------------------------------------------------------------- */
    public MiniPaint(String title, int width, int height) {
        super(title, width, height);
        tools = new Vector<>();
        elements = new Vector<>();
        // Symbolleiste erzeugen
        actualTool = new ToolLine(new Point(60,30));
        tools.add(actualTool);

        setVisible(true);
    }

    public static void main(String[] args) {
       new MiniPaint("Minipaint",800,600);
    }

    /* --------------------------------------------------------------------------
              Methoden
       -------------------------------------------------------------------------- */
    @Override
    public Vector<Paintable> getElements() {
        return elements;
    }

    @Override
    public Color getDrawingColor() {
        return Color.blue;
    }

    @Override
    public void paint(Graphics g) {
        for (Paintable element:elements) element.paint(g);
        for (Paintable tool:tools)       tool.paint(g);
    }

    /**
     * Invoked when a key has been pressed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key pressed event.
     *
     * @param e
     */
    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (actualTool instanceof Editable)
            ((Editable)actualTool).mousePressed(e,this);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (actualTool instanceof Editable)
            ((Editable)actualTool).mouseReleased(e,this);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (actualTool instanceof Editable)
            ((Editable)actualTool).mouseDragged(e,this);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (actualTool instanceof Editable)
            ((Editable)actualTool).mouseMoved(e,this);
    }
}
