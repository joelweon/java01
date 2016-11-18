package step05;

public class Exam047_1 {
  public static void main(String[] args) {
    switch (args[0]) {
    case "손님":
      System.out.println("조회만 가능합니다.");
    case "회원":
      System.out.println("조회, 변경, 삭제 가능합니다.");
    case "관리자":
      System.out.println("회원 등록 가능합니다.");
    default:
      System.out.println("유효하지 않은 권한입니다.");

    }
  }
}
