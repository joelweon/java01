package bitcamp.java89.ems.server.controller;

import java.io.PrintStream;
import java.util.HashMap;

import bitcamp.java89.ems.server.annotation.Component;
import bitcamp.java89.ems.server.annotation.RequestMapping;

public class StudentController {
  
}
  @Component
  public class StudentAddController {
    StudentDao studentDao;
    
    public void setStudentDao(StudentDao studentDao) {
      this.studentDao = studentDao;
    }
    
    @RequestMapping(value="studnet/add")
    public void add(HashMap<String,String> paramMap, PrintStream out) {
      if (studentDao.existUserId(paramMap.get("userId"))) {
        out.println("");
        return;
      }
      
      Student student = new Student();
      student.setUserId(paramMap.get("userId"));
      student.setPassword(paramMap.get("password"));
      student.setName(paramMap.get("name"));
      student.setTel(paramMap.get("tel"));
      student.setEmail(paramMap.get("email"));
      student.setWorking(paramMap.get("working").equals("y") ? true : false);
      student.setBirthYear(Integer.parseInt(paramMap.get("birthYear")));
      student.setSchool(paramMap.get("school"));
      
      studentDao.insert(student);
    }
}
