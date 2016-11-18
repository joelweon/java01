package step09.test1;
import java.util.Scanner;
public class Teacher000 {

  String name;
  String email;
  String tel;
  String major;
  String majorLanguage;
  String book;
  String projectName;
  String gitAddress;
  int workExperience;
  int lectureExperience;
  int age;
  int salary;


  public Teacher() {}

  public Teacher(String name, String email, String tel, int age) {
    this.name = name;
    this.email = email;
    this.tel = tel;
    this.age = age;
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



}
