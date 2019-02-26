public class Parallelograms extends Figure {
    private final double a;
    private final double b;
    private final double h;
    private double s;

    public Parallelograms(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        s = a*h;
        return s;
    }
}
