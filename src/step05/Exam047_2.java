package step05;

public class Exam047_2 {
  public static void main(String[] args) {
    switch (args[0]) {
    case "손님":
      System.out.println("조회만 가능합니다.");
      break;
    case "회원":
      System.out.println("조회, 변경, 삭제 가능합니다.");
      break;
    case "관리자":
      System.out.println("회원 등록 가능합니다.");
      break;
    default:
      System.out.println("유효하지 않은 권한입니다.");

    }
  }
}
//블록이 아닌 break로 제어.
//단순한 숫자나 문자로 명령어를 분기할 때 switch를 사용.
//단 4바이트 정수 값 or 문자열
