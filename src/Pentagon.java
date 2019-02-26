public class Pentagon extends Figure {
    private final double B;
    private final double P;
    private double s;
    public Pentagon(double b, double p) {
        B = b;
        P = p;
    }


    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        s = P * B;
        s = s/2;
        return s;
    }
}
