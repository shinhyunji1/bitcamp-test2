package test.pro;

public class solution2 {

  public static void main(String[] args) {
    String s = "abcde";
    Solution30 sol = new Solution30();
    System.out.println(sol.solution(s));
  }
}

class Solution30{

  public String solution(String s) {
    String answer ="";

    if (s.length() % 2 == 0) { 
      char arrayString1 = s.charAt((s.length() / 2) - 1);
      char arrayString2 = s.charAt(s.length() / 2);
      answer += arrayString1; 
      answer += arrayString2;
      return answer;
    } else if (s.length() % 2 == 1) {
      char arrayString2 = s.charAt(s.length() / 2);
      answer += arrayString2;
      return answer;
    }
    return answer;
  }
}
