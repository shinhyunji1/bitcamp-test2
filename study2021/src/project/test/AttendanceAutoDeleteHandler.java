package project.test;

//public class AttendanceAutoDeleteHandler implements Command {
//
//  RequestAgent requestAgent;
//
//  public AttendanceAutoDeleteHandler(RequestAgent requestAgent) {
//    this.requestAgent = requestAgent;
//  }
//
//  @Override
//  public void execute(CommandRequest request) throws Exception {
//    // 날짜 3일 지난 객체 리스트에서 삭제
//
//    requestAgent.request("dateCheck.delete", null);
//
//    if (requestAgent.getStatus().equals(RequestAgent.SUCCESS)) {
//      System.out.println("데이터 정리 완료!");
//      return;
//    }
//  }
//}
