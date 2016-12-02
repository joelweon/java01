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
    try (
        ObjectInputStream in = new ObjetInputStream(
        new FileInputStream(this.filename));) {
          list = (ArrayList<T>in.readObject();
        } catch (EOFExeption e) {
          
        } catch (Exception e) {
          list = new ArrayList<T>();
          throw new Exception("데이터 로딩 중 오류 발생!");
        }
  }
  
  public synchronized void save() {
    ObjectOutputStream out = new ObjectOutputStream(
        new FileOutputStream(this.filename));
  }
}
