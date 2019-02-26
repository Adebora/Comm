public class Circle extends Figure {
    private final double r;
    private double p;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        p = r*r;
        p = Math.PI * p;
        return p;
    }
}
