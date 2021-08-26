package project.test;

import java.util.Scanner;

public class App4 {

  public static void main(String[] args) {
    System.out.println("[카테고리]");
    Scanner keyboardScan = new Scanner(System.in);

    int no = 4;

    System.out.println("1. 소개");
    System.out.println("2. 약국");
    System.out.println("3. 힐러");
    System.out.println("4. 커뮤니티");
    System.out.print("> ");
    int status = Integer.valueOf(keyboardScan.nextLine());


    switch (status) {
      case 1:
        System.out.println("[게시판1]");
        System.out.print("<게시판 글쓰기>\n입력 : ");
        keyboardScan.next();
        System.out.println("글 등록 완료!");
        System.out.println();
        break;
      case 2:
        System.out.println("[게시판1]");
        System.out.print("<게시판 조회>");
        System.out.println();
        break;
      case 3:
        System.out.println("[게시판1]");
        System.out.print("<게시판 삭제>\n입력 : ");
        String input = keyboardScan.nextLine();
        if (input.equals("delete")) {
          System.out.println("<게시판 삭제>\n정말 삭제하시겠어요?");
          keyboardScan.next();
          System.out.println("글 삭제 완료!");

          System.out.println();
          break;
        }
        keyboardScan.close();

    }
  }


}
