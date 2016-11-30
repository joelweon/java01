package bitcamp.java89.ems.server.controller;

import java.io.PrintStream;
import java.util.HashMap;

import bitcamp.java89.ems.server.annotation.Component;
import bitcamp.java89.ems.server.annotation.RequestMapping;
import bitcamp.java89.ems.server.dao.StudentDao;
import bitcamp.java89.ems.server.vo.Student;

@Component(value="studnet/add")
public class StudentAddController {
  StudentDao studentDao;
  
  public void setStudentDao(StudentDao studentDao) {
    this.studentDao = studentDao;
    
  }
}