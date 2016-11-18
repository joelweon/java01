package step09.ex4;

public class Teacher {
  String id;
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


}
