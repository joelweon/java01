package bitcamp.java89.ems.server.context;

import java.awt.Component;
import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ApplicationContext {
  HashMap<String,Object> objPool = new HashMap<>();
  
  public ApplicationContext(String[] packages) {
    ArrayList<Class<?>> classList = getClassList(packages);
    prepareObjects(classList);
  }
  
  private ArrayList<Class<?>> getClassList(String[] packages) {
    ArrayList<Class<?>> classList = new ArrayList<>();
    
    for (String packageName : packages) {
      try {
        findClasses(packageNameToFile(packageName), classList);
      } catch (Exception e) {
        e.printStackTrace(s);
      }
    }
    
    
  }

  public Object getBean(String name) {
    return objPool.get(name);
  }
  
  public Collection<Object> getAllBeans() {
    return objPool.values();
  }
  
 
  
}