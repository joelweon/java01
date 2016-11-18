package step09.ex4;
import java.util.Scanner;
public class Eduapp {

  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {
      TeacherController.keyScan = keyScan;

    System.out.println();
    System.out.printf("비트캠프 관리시스템에 오신걸 환영합니다.\n\n");

    loop:
    while (true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine().toLowerCase();

      switch (command) {
        case "add": TeacherController.doAdd(); break;
        case "list": TeacherController.doList(); break;
        case "view": TeacherController.doView(); break;
        case "quit":
          System.out.println("Good Bye!");
          break loop;
        default:
          System.out.println("지원하지 않는 명령어입니다.");
      }
    }

  }

}
