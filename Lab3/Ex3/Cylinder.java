public class Cylinder extends Circle{
    private float h;

    public Cylinder(int x, int y, int r, int h){
        super(x,y,r);
        this.h=h;
    }

    public double calArea() {
        //float r=super.getR();
        return 2*Math.PI*r*(r+h);
    }

    public double calVolume() {
        return super.calArea()*h;
    }

    public String getName() {
        return "Cylinder";
    }
}
