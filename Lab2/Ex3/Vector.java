
public class Vector {
  private int x;
  private int y;

  public int getX() {
    return x;
  }
  public int getY() {
    return y;
  }

  public void setX(int x) {
    this.x=x;
  }
  public void setY(int y) {
    this.y=y;
  }

  public Vector add(Vector other) {
    Vector res = new Vector();
    res.setX(this.x + other.x);
    res.setY(this.y + other.y);
    return res;
  }

  public Vector subtract(Vector other) {
    Vector res = new Vector();
    res.setX(this.x - other.x);
    res.setY(this.y - other.y);
    return res;
  }

  public int multiply(Vector other) {
    return (this.x * other.x) + (this.y * other.y);
  }
}
