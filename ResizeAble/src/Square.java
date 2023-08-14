public class Square extends Geometry{
    double width2 = 1.0;

    public Square() {
        this.width2 = width2;
    }
public Square (double width2) {
        this.width2 = width2;
}
    public Square(String color, boolean filled, double width2) {
        super(color, filled);
        this.width2 = width2;
    }

    public double getWidth2() {
        return width2;
    }

    public void setWidth2(double width2) {
        this.width2 = width2;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width2=" + width2 +
                '}';
    }
}
