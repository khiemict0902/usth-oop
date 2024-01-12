package ex1;

public class Point extends Shape{
    private int x;
    private int y;
    
    public Point(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public String getName() {
        return "Point";
    }

}
