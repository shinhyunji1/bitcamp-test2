package example.ex;


class Number{
  static int num = 0; //클래스 필드
  int num2 = 0; //인스턴스 필드
}

public class StaticTest {

  public static void main(String[] args) {
    Number number1 = new Number(); //첫번째 number
    Number number2 = new Number(); //두번쨰 number

    System.out.println(number1.num++); //클래스 필드 num을 1증가시킴
    System.out.println(number1.num2++); //인스턴스 필드 num을 1증가시킴
    System.out.println("------------");
    System.out.println(number2.num); //두번째 number의 클래스 필드 출력
    System.out.println(number2.num2); //두번째 number의 인스턴스 필드 출력
  }
}