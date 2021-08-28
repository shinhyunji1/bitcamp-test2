package example.ch6;

public class Exercise6_2 {

  public static void main(String[] args) {
    SutdaCard card1 = new SutdaCard(3, false);
    SutdaCard card2 = new SutdaCard();

    System.out.println(card1.info());// 출력 결과 3
    System.out.println(card2.info());// 출력 결과 1K
  }

}

class SutdaCard {
  int num;
  boolean isKwang;

  SutdaCard() {
    this(1, true);// 한 줄로 쓴다면?
    //    this.num = 1;
    //    this.isKwang = true;
  }

  public SutdaCard(int num, boolean isKwang) {
    this.num = num;
    this.isKwang = isKwang;
  }

  String info() {// card 인스턴스의 정보를 문자열로 반환하기 위한 것.
    return num + (isKwang? "K" : "");
    // num, isKwang의 값을 문자열로 만들어서 반환한다.
    // isKwang의 값이 true인 경우에는 숫자 뒤에 "K"를 붙여서 삼항연산자를 이용
  }



}
