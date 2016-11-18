package step13.v2;

import java.util.Scanner;

public class BoxTest2 {
  static Scanner keyScan = new Scanner(System.in);
  static Box b = new Box();
  static Box head = b;
  static int count = 0;
  static int input;

  public static void main(String[] args) {
    loop:
    while (true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine();
      switch (command) {
        case "add":
          doAdd();
          break;
        case "list":
          doList();
          break;
        case "get":
          doGet();
          break;
        case "quit":
          System.out.println("Bye");
          break loop;
        default:
          System.out.println("지원하지 않는 명령어입니다.");
      }
    }
  }

  public static void doAdd() {
    System.out.print("입력할 값? ");
    b.value = Integer.parseInt(keyScan.nextLine());
    b.next = new Box();
    b = b.next;
    count++;
  }

  public static void doList() {
    Box cursor = head;
    while (cursor != null) {
      System.out.print(cursor + "-");
      cursor = cursor.next;
      if (cursor.next == null) {
        System.out.printf("\b \n");
        break;
      }
    }
  }

  public static void doGet() {
    System.out.print("인덱스? ");
    input = Integer.parseInt(keyScan.nextLine());
    Box cusor = head;
    if (count <= input) {
      System.out.println("입력 값을 초과하였습니다.");
    } else {
      for (int i = 0; i < input; ++i) {
        cusor = cusor.next;
      }
      System.out.println(cusor.toString());
    }
  }

}
