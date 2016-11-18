package step09.ex5;
import java.util.Scanner;
public class TeacherController {
  Teacher[] teachers = new Teacher[100];
  int length = 0;
  Scanner keyScan;

  public TeacherController(Scanner keyScan) {
    this.keyScan = keyScan;
  }

  void doAdd() {
    while (length < this.teachers.length) {
      Teacher teacher = new Teacher();
      Scanner keyScan = new Scanner(System.in);

      System.out.print("아이디?(예:qwe) ");
      teacher.id = this.keyScan.nextLine();

      System.out.print("이름?(예:남경훈) ");
      teacher.name = this.keyScan.nextLine();

      System.out.print("이메일?(예:bit@bitc.com) ");
      teacher.email = this.keyScan.nextLine();

      System.out.print("전화번호?(예:000-1234-5678) ");
      teacher.tel = this.keyScan.nextLine();

      System.out.print("전공?(예:컴퓨터공학) ");
      teacher.major = this.keyScan.nextLine();

      System.out.print("주요언어?(예:C, JAVA) ");
      teacher.majorLanguage = this.keyScan.nextLine();

      System.out.print("저서?(예:자바 웹 개발 워크북 소개) ");
      teacher.book = this.keyScan.nextLine();

      System.out.print("프로젝트명?(예:ABC) ");
      teacher.projectName = this.keyScan.nextLine();

      System.out.print("Git주소?(예:https://github.com/abcd) ");
      teacher.gitAddress = this.keyScan.nextLine();

      System.out.print("직장경력?(예:10) ");
      teacher.workExperience = Integer.parseInt(this.keyScan.nextLine());

      System.out.print("강의경력?(예:3) ");
      teacher.lectureExperience = Integer.parseInt(keyScan.nextLine());

      System.out.print("나이?(예:40) ");
      teacher.age = Integer.parseInt(this.keyScan.nextLine());

      System.out.print("희망급여?(예:100000) ");
      teacher.salary = Integer.parseInt(this.keyScan.nextLine());

      teachers[length++] = teacher;
      System.out.print("계속 입력하시겠습니까?(y/n) ");
      if (!keyScan.nextLine().equals("y"))
        break;
    }
  }


  public void doList() {
    for (int i = 0; i < this.length; i++) {
      Teacher teacher = this.teachers[i];
      System.out.printf("%s,%s,%s,%s,%s,%s,%s,%s,%s,%d,%d,%d,%d\n",
        teacher.id,
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

        System.out.println("-----------------------------------");
    }
  }

  void doView() {
    System.out.print("조회할 id입력: ");
    String id = this.keyScan.nextLine().toLowerCase();
    for (int i = 0; i < this.length; i++) {
      if (this.teachers[i].id.toLowerCase().equals(id)) {
        System.out.printf("아이디: %s\n", this.teachers[i].id);
        System.out.printf("이름: %s\n", this.teachers[i].name);
        System.out.printf("이메일: %s\n", this.teachers[i].email);
        System.out.printf("전화번호: %s\n", this.teachers[i].tel);
        System.out.printf("주요언어: %s\n", this.teachers[i].majorLanguage);
        System.out.printf("저서: %s\n", this.teachers[i].book);
        System.out.printf("프로젝트명: %s\n", this.teachers[i].projectName);
        System.out.printf("Git주소: %s\n", this.teachers[i].gitAddress);
        System.out.printf("직장경력: %d\n", this.teachers[i].workExperience);
        System.out.printf("강의경력: %d\n", this.teachers[i].lectureExperience);
        System.out.printf("나이: %d\n", this.teachers[i].age);
        System.out.printf("희망급여: %d\n", this.teachers[i].salary);

        System.out.println("-----------------------------------");
        break;
      }
    }
  }
}
