package example.ch6;

public class Exercise6_22 {

  static boolean isNumber(String str) {
    //    Integer.valueOf(str);
    for (int i = 0; i < str.length(); i++) {//str 길이만큼 반복한다.
      //      if (str(i) == Integer.valueOf(i)) {
      char a = str.charAt(i);// 한개의 문자열을 가져와서 a라는 변수에 저장.
      if ('0'>a || a>'9') // 저장한 a가 0보다 작고 9보다 크다면 false
        //        i++;
        return false;//하나라고 숫자가 아니면 즉시 종료 
    }
    return true;
  }

  public static void main(String[] args) {
    String str = "123ff";
    System.out.println(str+"는 숫자입니까? "+ isNumber(str));
    str = "1234";
    System.out.println(str+"는 숫자입니까? "+ isNumber(str));
  }

}

//불가능한 이유는
//char a = str.charAt(i);
//if ('0'<=a || a<='9')
//  return true; // 굳이 숫자라고 정해서 맞으면 true로 할 필요가 없다.