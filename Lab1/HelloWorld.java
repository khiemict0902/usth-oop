public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello");
    
    int x=4;
    for (int i = 0; i < x; i++) {
      for (int j = 0 ; j <i+1 ; j++) {
        System.out.print("Hello"+' ');
      }
      System.out.print('\n');
    }

    int a=3;
    if(a<5){
      System.out.println("hehe");
    }

    else{
      System.out.println("haha");
    }
  }
}
