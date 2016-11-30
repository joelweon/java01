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
    injectDependencies();
  }
  
  private void injectDependencies() {
    Collection<Object> objects = objPool.values();
    
    for (Object obj : objects) {
      Method[] methods = obj.getClass().getMethods();
      
      for (Method m : methods) {
        if (!m.getName().startsWith("set")) {
          continue;
        }
        if (m.getParameterCount() != 1) {
          continue;
        }
        
        Class<?> paramType = m.getParameterTypes()[0];
        Object dependency = findDependency(paramType);
        if (dependency != null) {
          m.invoke(obj, dependency);
        }
      }
    }
    
  }

  private Object findDependency(Class<?> paramType) {
    Collection<Object> objects = objPool.values();
    for (Object obj : objects) {
      if (paramType.isInstance(obj)) {
        return obj;
      }
    }
    return null;
  }

  private void prepareObjects(ArrayList<Class<?>> classList) {
    for (Class<?> clazz : classList) {
      Object obj = clazz.newInstance();
      
      Component compAnno = clazz.getAnnotation(Component.class);
      
      if (compAnno.value().length() == 0) {
        objPool.put(clazz.getName(), obj);
        
      }
    }
  }
  

  private ArrayList<Class<?>> getClassList(String[] packages) {
    ArrayList<Class<?>> classList = new ArrayList<>();
    
    for (String packageName : packages) {
      try {
        findClasses(packageNameToFile(packageName), classList);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return classList;
  }
private void findClasses(File dir, ArrayList<Class<?>> classList) {
    if (!dir.isDirectory()) {
      return;
    }
    
    File[] files = dir.listFiles(new FileFilter() {
      @Override
      public boolean accept(File pathname) {
        if (pathname.isDirectory())
          return true;
        if (pathname.getName().endsWith(".class") && !pathname.getName().contains("$"))
          return true;
        return false;
      }
    });
    for (File file : files) {
      if (file.isDirectory()) {
        findClasses(file, classList);
      } else {
        Class<?> c = loadClass(file);
        if (!isAbstract(c) && isComponent(c)) {
          classList.add(c);
        }
      }
    }
  }



  private boolean isComponent(Class<?> c) {
    return c.getAnnotation(Component.class) != null;
}



  private boolean isAbstract(Class<?> clazz) {
    if ((clazz.getModifiers() & Modifier.ABSTRACT) == Modifier.ABSTRACT) {
      return true;
    }
  return false;
}



  private Class<?> loadClass(File file) {
    String path = file.getCanonicalPath().replaceAll("\\\\", "/").replaceAll(".class", "");
    int pos = path.indexOf("/bin");
    return Class.forName(path.substring(pos + 5).replaceAll("/", "."));
  }



private Object packageNameToFile(String packageName) {
    return new File("./bin/" + packageName.replaceAll("\\.", "/"));
  }






  public Object getBean(String name) {
    return objPool.get(name);
  }

}
