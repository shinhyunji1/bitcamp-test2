package test.pro;

public class Test01 {

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      for (int j = 5; i < j; j--) {
        if (i <= j) {
          System.out.print("*");
        }
      }
      System.out.println("");
    }
  }
}
