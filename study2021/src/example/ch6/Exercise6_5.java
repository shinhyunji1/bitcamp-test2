package example.ch6;

public class Exercise6_5 {

  public static void main(String[] args) {
    Student2 s = new Student2("홍길동", 1, 1, 100, 60, 76);

    s.info();
  }
}

class Student2 {
  String name;
  int ban;
  int no;
  int kor;
  int eng;
  int math;

  Student2(String name, int ban, int no, int kor, int eng, int math) {
    this.name = name;
    this.ban = ban;
    this.no = no;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  int getTotal() {
    return kor + eng + math;
  }

  float getAverage() {
    return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
  }

  public void info() {
    System.out.println(name);
    System.out.println(ban);
    System.out.println(no);
    System.out.println(kor);
    System.out.println(eng);
    System.out.println(math);
    System.out.println(getTotal());
    System.out.println(getAverage());

  }
}