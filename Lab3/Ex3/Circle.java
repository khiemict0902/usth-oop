public class Circle extends Point{
    protected float r;

    public Circle(int x, int y, int r) {
        super(x,y);
        this.r=r;
    }

    public float getR() {
        return r;
    }

    public double calArea() {
        return 2*Math.PI*r*r;
    }

    public String getName() {
        return "Circle";
    }
}
