package bitcamp.java89.ems.server.dao;

import java.io.ObjectInputStream;
import java.util.ArrayList;

public abstract class AbsractDao<T> {
  
  private String filename;
  protected ArrayList<T> list;
  
  public void setFilename(String filename) {
    this.filename = filename;
  }
  
  public void load() throws Exception {
    ObjectInputStream in = new ObjectInputStream(
        new FileInputStream(this.filenam));
  }
  
  public synchronized void save() {
    ObjectOutputStream out = new ObjectOutputStream(
        new FileOutputStream(this.filename));
  }
}
