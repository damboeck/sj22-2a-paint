package animation;

public interface Animateable {

    void calcStep(double dT, Vect2D a);

    void wallVertical(double x);

    void wallHorizontal(double y);

}
