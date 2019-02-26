public class Triangle extends Figure {
    protected final int x, y, z;
    private final double h;
    private double p;

    public Triangle(int x, int y, int z, double h, double p) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.h = h;
        this.p = p;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public double getPerimeter() {
        return x + z + y;
    }

    @Override
    public double getArea() {
        p= x*h;
        p= p/2;
        return p;
    }
}