package example.ch6;

public class Exercise6_19 {

  public static void change(String str2) {
    str2 += "456";
    System.out.println(str2);
  }

  public static void main(String[] args) {
    String str = "ABC123";
    System.out.println(str);

    String str2 = str;
    change(str2);

  }
}
