package step09.test1;
import java.util.Scanner;
public class Eduapp {

  public static void main(String[] args) {
    System.out.println();
    System.out.printf("비트캠프 관리시스템에 오신걸 환영합니다.\n\n");

    Teacher[] teachers = new Teacher[100];
    int length = 0;
    Scanner keyScan = new Scanner(System.in);


    while (true) {
      System.out.println("명령을 내려주세요. ex)add or list or view");
      String inputStart = keyScan.nextLine();
      if (inputStart.equals("add")) {
        add(teachers, length++);
      } else if (inputStart.equals("list")) {
        printTeacherList(teachers, length);
      } else if(inputStart.equals("view")) {
        view(teachers, length);
      } else {
        System.out.println("잘못 입력!");
      }
      System.out.println("다시 입력하겠습니까? (y/n)");
      inputStart = keyScan.nextLine();
      if (!inputStart.equals("y")) {
        break;
      }
    }
  }






  static void view(Teacher[] teachers, int length) {
    for (int i = 0; i < length; i++) {
      Teacher teacher = teachers[i];
        System.out.printf("이름: %s\n이메일: %s\n전화번호: %s\n전공: %s\n주요언어: %s\n저서: %s\n프로젝트명: %s\nGit주소: %s\n직장경력: %d\n강의경력: %d\n나이: %d\n희망급여: %d\n",
        teacher.name,
        teacher.email,
        teacher.tel,
        teacher.major,
        teacher.majorLanguage,
        teacher.book,
        teacher.projectName,
        teacher.gitAddress,
        teacher.workExperience,
        teacher.lectureExperience,
        teacher.age,
        teacher.salary);
        System.out.println("------------------------------");
    }
  }

  static void add(Teacher[] teachers, int length) {
    while (length < teachers.length) {
      Teacher teacher = new Teacher();
      Scanner keyScan = new Scanner(System.in);

      System.out.print("이름?(예:남경훈) ");
      teacher.name = keyScan.nextLine();

      System.out.print("이메일?(예:bit@bitc.com) ");
      teacher.email = keyScan.nextLine();

      System.out.print("전화번호?(예:000-1234-5678) ");
      teacher.tel = keyScan.nextLine();

      System.out.print("전공?(예:컴퓨터공학) ");
      teacher.major = keyScan.nextLine();

      System.out.print("주요언어?(예:C, JAVA) ");
      teacher.majorLanguage = keyScan.nextLine();

      System.out.print("저서?(예:자바 웹 개발 워크북 소개) ");
      teacher.book = keyScan.nextLine();

      System.out.print("프로젝트명?(예:ABC) ");
      teacher.projectName = keyScan.nextLine();

      System.out.print("Git주소?(예:https://github.com/abcd) ");
      teacher.gitAddress = keyScan.nextLine();

      System.out.print("직장경력?(예:10) ");
      teacher.workExperience = Integer.parseInt(keyScan.nextLine());

      System.out.print("강의경력?(예:3) ");
      teacher.lectureExperience = Integer.parseInt(keyScan.nextLine());

      System.out.print("나이?(예:40) ");
      teacher.age = Integer.parseInt(keyScan.nextLine());

      System.out.print("희망급여?(예:100000) ");
      teacher.salary = Integer.parseInt(keyScan.nextLine());
      teachers[length] = teacher;
      break;
    }
  }


  static void printTeacherList(Teacher[] teachers, int length) {
    for (int i = 0; i < length; i++) {
      Teacher teacher = teachers[i];
      System.out.printf("%s,%s,%s,%s,%s,%s,%s,%s,%d,%d,%d,%d\n",
        teacher.name,
        teacher.email,
        teacher.tel,
        teacher.major,
        teacher.majorLanguage,
        teacher.book,
        teacher.projectName,
        teacher.gitAddress,
        teacher.workExperience,
        teacher.lectureExperience,
        teacher.age,
        teacher.salary);
    }
  }

}
