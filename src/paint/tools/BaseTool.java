package paint.tools;

import paint.Paintable;

import java.awt.*;

public abstract class BaseTool implements Paintable {

    /** linke obere Ecke als Ankerpunkt des Werkzeugs */
    protected Point base;

    public BaseTool(Point base){
        this.base = base;
    }
}
