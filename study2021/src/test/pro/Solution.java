package test.pro;

public class Solution {

  String name;

  public String solution(int num) {
    if (num % 2 == 0) {
      return name + "Even";
    } else if (num % 2 == 1) {
      return name + "Odd";
    }
    return name;
  }

  //  public static void main(String[] args) {
  //    int num = 0;
  //
  //  }


}

