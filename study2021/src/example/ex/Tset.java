package example.ex;

public class Tset {
  // while(true) {
  //     String status = Prompt.inputString("[좋아요 (#: 👍🏻) / 신고하기(!: 🚨) /\n"
  //         + "댓글달기(@: 💬) / 넘어가기: Enter]> ");
  //     if (status.equals("#")) {
  //       freeBoard.setLike(freeBoard.getLike() + 1);
  //       System.out.println("게시글 좋아요를 눌렀습니다.");
  //       break;
  //     } else if (status.equals("@")) {
  //       System.out.println("[댓글 달기]");
  //       System.out.println();
  //       int commentTotal = Comment.getCommentTotal();
  //       Comment comment = new Comment(); 

  //       if (commentTotal == 0) {
  //         comment.setNo(1);
  //         commentTotal++;
  //         Comment.setCommentTotal(commentTotal);
  //         comment.setCommentBoardNo(freeBoard.getNo());
  //         comment.setCommentWriter(freeBoard.getWriter().getId());
  //         comment.setCommenter(AuthLoginHandler.getLoginUser().getId());
  //         System.out.printf("-%s-\n", AuthLoginHandler.getLoginUser().getId());
  //         comment.setCommentContent(Prompt.inputString("댓글 내용> "));

  //         commentList.add(comment);
  //         break;
  //       } else {
  //         int lastIndex = 0;
  //         for (int i = 0; i < commentList.size(); i++) {
  //           if (commentList.get(i).getCommentBoardNo() == freeBoard.getNo()) {
  //             lastIndex++;
  //           }
  //         }

  //         Comment.setCommentTotal(commentTotal++);
  //         comment.setNo(++lastIndex);
  //         comment.setCommentBoardNo(freeBoard.getNo());
  //         comment.setCommentWriter(freeBoard.getWriter().getId());
  //         comment.setCommenter(AuthLoginHandler.getLoginUser().getId());
  //         System.out.printf("-%s-\n", AuthLoginHandler.getLoginUser().getId());
  //         comment.setCommentContent(Prompt.inputString("댓글 내용> "));

  //         commentList.add(comment);
  //         break;


  //         //        request.setAttribute("no", no);
  //         //        request.getRequestDispatcher("/comment/add").forward(request);

  //       }
  //     } else if (status.equals("!")) {
  //       freeBoard.setReason(Prompt.inputString("신고 사유를 작성해 주세요> "));
  //       reportList.add(freeBoard);
  //       freeBoard.setRequester(AuthLoginHandler.loginUser.getId());
  //       System.out.println("신고 접수가 완료되었습니다. 깨끗한 게시판 문화를 만드는데 도움을 주셔서 감사합니다!");
  //       break;
  //     }
  //     else if (status.equals("")){
  //       break;
  //     } else {
  //       System.out.println("메뉴에 맞는 명령어를 입력해 주세요.");
  //       continue;
  //     }
  //   }
}



