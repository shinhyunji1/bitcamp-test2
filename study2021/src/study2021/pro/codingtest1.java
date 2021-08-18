package study2021.pro;

public class codingtest1 {

  long total;
  public long solution(int price, int money, int count) {
    for (int i = 0; i < count; i++) {
      total += price * (i+1);//증가할때마다 가격에 count 곱해서 더하기

    }
    if (total < money) {
      return 0;
    } else {
      total -= money;
      return total;
    }
  }

  public static void main(String[] args) {

    codingtest1 sol = new codingtest1();
    long answer = sol.solution(3, 20, 4);
    System.out.println(answer);

  }

}
