
public class VectorTestCase {
  public static void main(String[] args) {
    Vector A = new Vector();
    Vector B = new Vector();
    Vector res = new Vector();

    A.setX(1);
    A.setY(2);
    B.setX(3);
    B.setY(4);

    System.out.println("Vector A:");
    System.out.println("X: " + A.getX());
    System.out.println("Y: " + A.getY());
    
    System.out.println("Vector B:");
    System.out.println("X: " + B.getX());
    System.out.println("Y: " + B.getY());
    
    res = A.add(B);
    System.out.println("Addition:");
    System.out.println("X: " + res.getX());
    System.out.println("Y: " + res.getY());
    
    res = A.subtract(B); 
    System.out.println("Subtraction:");
    System.out.println("X: " + res.getX());
    System.out.println("Y: " + res.getY());
    
    System.out.println("Multiplication: " + A.multiply(B));
    
  }
} 
