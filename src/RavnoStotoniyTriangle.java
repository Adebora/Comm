public class RavnoStotoniyTriangle extends Triangle {
    private double p;

    public RavnoStotoniyTriangle(int x) {
        super(x, x, x);
    }

    public int getX() {
        return x;
    }

    @Override
    public double getArea(){
        p = x*x;
        p = p * Math.sqrt(3);
        p = p / 4;
        return p;
    }
}