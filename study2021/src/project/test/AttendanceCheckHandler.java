package project.test;

//public class AttendanceCheckHandler implements Command {
//
//  RequestAgent requestAgent;
//
//  public AttendanceCheckHandler(RequestAgent requestAgent) {
//    this.requestAgent = requestAgent;
//  }
//
//
//  @Override
//  public void execute(CommandRequest request) throws Exception {
//
//    System.out.println();
//    System.out.println("[출석체크] 페이지입니다.");
//    System.out.println();
//    String loginUser = AuthLoginHandler.getLoginUser().getId();
//    HashMap<String,String> params = new HashMap<>();
//    params.put("id", loginUser); // 해쉬맵에 추가해서 나중에 비교할 것
//
//    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // 이 날짜를 사용할 것
//    Date today = new Date();
//
//    String input = Prompt.inputString("출석체크(C) / 뒤로가기(0)");
//    if(input.equals("0")) { // 만약 0이라면 종료
//      return;
//    } else if(input.equalsIgnoreCase("c")) { // 만약 c를 누르면 
//      requestAgent.request("dateCheck.selectList", null); // 리퀘스트로 데잇체크에 목록을 살펴본다.
//      // 만약에 오늘 처음 출석이고
//      // dateList에 오늘 날짜가 없으면 or dateList에 날짜가 있는데 내 아이디가 없을 때
//
//      if(requestAgent.getStatus().equals(RequestAgent.FAIL)) { // dateCheckList == 0으로 dateList에 오늘 날짜가 없으면
//        // (member)로그인 유저 포인트 적립 > 데이터에 저장
//        requestAgent.request("member.selectOneById", params); // 데이터에 멤버의 아이디를 해쉬맵에 추가
//        if (requestAgent.getStatus().equals(RequestAgent.FAIL)) { // 만약에 찾았는데 없다면
//          System.out.println("해당 회원이 없습니다."); 
//          return;
//        }
//        Member member = requestAgent.getObject(Member.class); // 리퀘스트에서 멤버 클래스를 사용한다.
//        member.setCount(member.getCount() + 30); // 그 맴버 클래스의 포인트 점수를 +30을 추가한다.
//        requestAgent.request("member.update", member); // 맴버의 업데이트 데이터로 저장
//
//        if (requestAgent.getStatus().equals(RequestAgent.FAIL)) { // 이미 아이디가 있다면 
//          System.out.println("포인트 적립 실패!");
//          return;
//        }
//
//        System.out.println("금일 첫 출석체크로 30포인트가 적립되었습니다.");
//
//        // 날짜/아이디 저장
//        DateCheck dateCheck = new DateCheck();
//        dateCheck.setDate(today);
//        dateCheck.setUser(loginUser);
//        requestAgent.request("dateCheck.insert", dateCheck); // dateCheck 추가 데이터로 저장
//
//        if (requestAgent.getStatus().equals(RequestAgent.FAIL)) { // 저장 할 때 실패하면
//          System.out.println("오늘 날짜 저장 실패!");
//          return;
//        }
//        // 3일 지난 데이터 정리
//        request.getRequestDispatcher("/auth/deleteCheck").forward(request);
//
//        return;
//
//      } else { // dateCheckList != 0 dateCheckList에 오늘 날짜가 있다면
//        requestAgent.request("dateCheck.selectList", null); // dateCheck에 목록 확인
//        List<DateCheck> dateCheckList = (List<DateCheck>) requestAgent.getObjects(DateCheck.class);
//        // 오늘 날짜가 있는지 && 내 아이디 있는지
//        for(int i = 0; i < dateCheckList.size(); i++) {
//          String time1 = format.format(dateCheckList.get(i).getDate());
//          String time2 = format.format(today);
//          if(time1.equals(time2)) { // 변수 i번째의 데이터와 오늘 날짜와 같다면
//            for(int j = 0; j < dateCheckList.size(); j++) {
//              if(dateCheckList.get(j).getUser().equals(loginUser)) { // 그리고 리스트 중에 로그인 유저가 현재 계정과 같다면
//                System.out.println("이미 출석체크 포인트를 받으셨습니다.");
//                return;
//              }
//            }
//            // 오늘 날짜는 있는데 내 아이디가 없을 때
//            requestAgent.request("member.selectOneById", params); // 해쉬맵에서 데이터 멤버의 아이디 중 하나를 찾아서
//            if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
//              System.out.println("해당 회원이 없습니다.");
//              return;
//            }
//            Member member = requestAgent.getObject(Member.class);
//            member.setCount(member.getCount() + 30);
//            requestAgent.request("member.update", member);
//
//            if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
//              System.out.println("포인트 적립 실패!");
//              return;
//            }
//
//            System.out.println("금일 첫 출석체크로 30포인트가 적립되었습니다.");
//
//            DateCheck dateCheck = new DateCheck();
//            dateCheck.setDate(today);
//            dateCheck.setUser(loginUser);
//
//            requestAgent.request("dateCheck.insert", dateCheck);
//
//            if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
//              System.out.println("오늘 날짜 저장 실패!");
//              return;
//            }
//
//            // 3일 지난 데이터 정리
//            request.getRequestDispatcher("/auth/deleteCheck").forward(request);
//            return;
//          }
//        }
//        // 오늘 날짜가 없을 때
//
//        requestAgent.request("member.selectOneById", params);
//        if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
//          System.out.println("해당 회원이 없습니다.");
//          return;
//        }
//        Member member = requestAgent.getObject(Member.class);
//        member.setCount(member.getCount() + 30);
//        requestAgent.request("member.update", member);
//
//        if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
//          System.out.println("포인트 적립 실패!");
//          return;
//        }
//
//        System.out.println("금일 첫 출석체크로 30포인트가 적립되었습니다.");
//
//        DateCheck dateCheck = new DateCheck();
//        dateCheck.setDate(today);
//        dateCheck.setUser(loginUser);
//
//        requestAgent.request("dateCheck.insert", dateCheck);
//
//        if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
//          System.out.println("오늘 날짜 저장 실패!");
//          return;
//        }
//
//        // 3일 지난 데이터 정리
//        request.getRequestDispatcher("/auth/deleteCheck").forward(request);
//        return;
//      }
//
//    }
//  }
//}
