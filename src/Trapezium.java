public class Trapezium extends Figure {
    private final double a;
    private final double b;
    private final double h;
    private double p;

    public Trapezium(double a, double b, double h) {
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
        p = a + b;
        p = p/2;
        p = p *h;
        return p;
    }
}
