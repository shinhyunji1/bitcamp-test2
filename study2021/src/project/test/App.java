package project.test;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner keyboardScan = new Scanner(System.in);

    final int LENGTH = 5;
    String[] name = new String[LENGTH];
    String[] password = new String[LENGTH];
    String[] nickname = new String[LENGTH];
    String[] email = new String[LENGTH];
    String[] tel = new String[LENGTH];
    int size = 0;

    final int DOCTOR_LENGTH = 5;
    String[] dname = new String[DOCTOR_LENGTH];
    String[] dpassword = new String[DOCTOR_LENGTH];
    String[] demail = new String[DOCTOR_LENGTH];
    String[] dtel = new String[DOCTOR_LENGTH];
    String[] dphoto = new String[DOCTOR_LENGTH];
    int dsize = 0;

    while (true) {
      System.out.print("메인> ");
      String input = keyboardScan.nextLine();
      if (input.equals("exit") || input.equals("quit")) {
        System.out.println("안녕!");
        break;
      } else if (input.equals("/member/add")) {
        System.out.println("[회원가입]");
        System.out.println("1. 일반 회원가입");
        System.out.println("2. 의사 회원가입");
        System.out.print("> ");
        int no = Integer.valueOf(keyboardScan.nextLine());

        switch (no) {
          case 1:
            for (int i = 0; i < LENGTH; i++) {
              System.out.println("1. 일반 회원가입");
              System.out.print("이름 : ");
              name[size] = keyboardScan.next();
              System.out.print("비밀번호 : ");
              password[size] = keyboardScan.next();
              System.out.print("닉네임 : ");
              nickname[size] = keyboardScan.next();
              System.out.print("이메일 : ");
              email[size] = keyboardScan.next();
              System.out.print("핸드폰 : ");
              tel[size] = keyboardScan.next();

              System.out.println();
              System.out.println("**회원가입을 축하합니다!**");

              size++;
              System.out.println();
            }
            break;
          case 2:
            for (int i = 0; i < DOCTOR_LENGTH; i++) {
              System.out.println("2. 의사 회원가입");
              System.out.print("이름 : ");
              name[dsize] = keyboardScan.next();
              System.out.print("비밀번호 : ");
              password[dsize] = keyboardScan.next();
              System.out.print("이메일 : ");
              email[dsize] = keyboardScan.next();
              System.out.print("핸드폰 : ");
              tel[dsize] = keyboardScan.next();
              System.out.print("사진 : ");
              dphoto[dsize] = keyboardScan.next();

              System.out.println();
              System.out.println("**회원가입을 축하합니다!**");

              dsize++;
              System.out.println();
            }
            break;
        }


      } else if (input.equals("/member/list")) {
        for (int i = 0; i < size; i++) {
          System.out.printf("이름 : %s\n", name[i]);
          System.out.printf("비밀번호 : %s\n", password[i]);
          System.out.printf("닉네임 : %s\n", nickname[i]);
          System.out.printf("이메일 : %s\n", email[i]);
          System.out.printf("핸드폰 : %s\n", tel[i]);
          System.out.println();

        }

      } else if (input.equals("/doctormember/list")) {
        for (int i = 0; i < dsize; i++) {
          System.out.printf("이름 : %s\n", dname[i]);
          System.out.printf("이름 : %s\n", dname[i]);
          System.out.printf("비밀번호 : %s\n", dpassword[i]);
          System.out.printf("이메일 : %s\n", demail[i]);
          System.out.printf("핸드폰 : %s\n", dtel[i]);
          System.out.printf("사진 : %s", dphoto[i]);
        }
      }
    }
    keyboardScan.close();

  }



}
