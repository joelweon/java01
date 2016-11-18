package step13.v2;

import java.util.Scanner;

public class BoxTest20 {
  static Scanner keyScan;
  static Box head;
  static Box tail;
  static int length;

  static {
    head = new Box();
    tail = head;
    keyScan = new Scanner(System.in);
    length = 0;
  }

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
        case "delete":
          doDelete();
          break;
        case "quit":
          System.out.println("Bye");
          break loop;
        default:
          System.out.println("지원하지 않는 명령어입니다.");
      }
    }
  }

  static void doDelete() {
    System.out.print("삭제할 인덱스? ");
    int index = Integer.parseInt(keyScan.nextLine());
    Box cusor = head;
    if (index < 0 || length <= index) {
      System.out.println("인덱스가 유효하지 않습니다.");
    } else {
      for (int i = 0; i < index; ++i) {
        cusor = cusor.next;
      }
      System.out.println(cusor.toString());
    }
  }


  static void doAdd() {
    System.out.print("입력할 값? ");
    tail.value = Integer.parseInt(keyScan.nextLine());
    tail.next = new Box();
    tail = tail.next;
    length++;
  }

  static void doList() {
    Box cursor = head;
    while (cursor != null && tail != null) {
      System.out.print(cursor.toString() + "-");
      cursor = cursor.next;
      if (cursor.next == null) {
        System.out.printf("\b \n");
        break;
      }
    }
  }

  static void doGet() {
    System.out.print("인덱스? ");
    int index = Integer.parseInt(keyScan.nextLine());
    Box cusor = head;
    if (index < 0 || length <= index) {
      System.out.println("인덱스가 유효하지 않습니다.");
    } else {
      for (int i = 0; i < index; ++i) {
        cusor = cusor.next;
      }
      System.out.println(cusor.toString());
    }
  }

}
