public class NameCardTestDrive {
  public static void main(String[] args) {
    NameCard c = new NameCard();
    c.setName("A");
    c.setPhone("098123456");
    c.setEmail("hello@gmail.com");
    
    System.out.println("Name:  " + c.getName());
    System.out.println("Phone: " + c.getPhone());
    System.out.println("Email: " + c.getEmail());
  }
}
