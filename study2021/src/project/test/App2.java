package project.test;

import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {
    System.out.println("[회원가입]");
    Scanner keyboardScan = new Scanner(System.in);

    String name;
    String password;
    String nickname;
    String email;
    String tel;

    System.out.println("1. 일반 회원가입");
    System.out.println("2. 의사 회원가입");
    System.out.print("> ");
    int no = Integer.valueOf(keyboardScan.nextLine());

    switch (no) {
      case 1:
        System.out.println("1. 일반 회원가입");
        System.out.print("이름 : ");
        name = keyboardScan.next();
        System.out.print("비밀번호 : ");
        password = keyboardScan.next();
        System.out.print("닉네임 : ");
        nickname = keyboardScan.next();
        System.out.print("이메일 : ");
        email = keyboardScan.next();
        System.out.print("핸드폰 : ");
        tel = keyboardScan.next();

        System.out.println();
        System.out.println("**회원가입을 축하합니다!**");
        System.out.println("회원정보");

        System.out.printf("이름 : %s\n", name);
        System.out.printf("비밀번호 : %s\n", password);
        System.out.printf("닉네임 : %s\n", nickname);
        System.out.printf("이메일 : %s\n", email);
        System.out.printf("핸드폰 : %s", tel);
        break;
      case 2:
        System.out.println("2. 의사 회원가입");
        System.out.print("이름 : ");
        String name2 = keyboardScan.next();
        System.out.print("비밀번호 : ");
        String password2 = keyboardScan.next();
        System.out.print("이메일 : ");
        String email2 = keyboardScan.next();
        System.out.print("핸드폰 : ");
        String tel2 = keyboardScan.next();
        System.out.print("사진 : ");
        String photo2 = keyboardScan.next();

        System.out.println();
        System.out.println("**회원가입을 축하합니다!**");
        System.out.println("회원정보");

        System.out.printf("이름 : %s\n", name2);
        System.out.printf("비밀번호 : %s\n", password2);
        System.out.printf("이메일 : %s\n", email2);
        System.out.printf("핸드폰 : %s\n", tel2);
        System.out.printf("사진 : %s", photo2);
        break;
    }

  }

}
