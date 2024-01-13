public class Point implements Shape {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public double calArea(){
        return 0;
    };

    public double calVolume() {
        return 0;
    }

    public String getName() {
        return "Point";
    }
}
