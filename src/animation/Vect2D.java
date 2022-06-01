package animation;

public class Vect2D {

    public final double x;
    public final double y;
    public Vect2D(double x, double y) {
        this.x=x;
        this.y=y;
    }
    public Vect2D neg() {
        return new Vect2D(-x,-y);
    }
    public Vect2D mul(double k) {
        return new Vect2D(x*k,y*k);
    }
    public double mul(Vect2D v) {
        return  x*v.x+y*v.y;
    }
    public Vect2D add(Vect2D v) {
        return new Vect2D(x+v.x,y+v.y);
    }
    public Vect2D sub(Vect2D v) {
        return add(v.neg());
    }
}
