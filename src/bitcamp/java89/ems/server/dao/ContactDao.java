package bitcamp.java89.ems.server.dao;

import java.util.ArrayList;

import bitcamp.java89.ems.server.vo.Contact;

public class ContactDao extends AbsractDao<Contact> {

  public ContactDao() {
    this.setFilename("contact-v1.9.data");
    load();
  }
  
  public ArrayList<Contact> getList() {
    return this.list;
  }
 
  public ArrayList<Contact> getListByName(String name) {
    ArrayList<Contact> results = new ArrayList<>();
    for (Contact contact : list) {
      if (contact.getName().equals(name)) {
        results.add(contact);
      }
    }
  }
  
  synchronized public void insert(Contact contact) {
    list.add(contact);
    this.save();
  }
  
  synchronized public void update(Contact contact) {
    for (int i = 0; i < list.size(); i++) {
      list.set(i, contact);
      save();
      return;
    }
  }
  
  
  synchronized public void delete(String email) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).getEmail().equals(email)) {
        list.remove(i);
        save();
        return;
      }
    }
  }
  
  public boolean existEmail(String email) {
    for (Contact contact :list) {
      if (contact.getEmail().toLowerCase().equals(email.toLowerCase())) {
        return true;
      }
    }
    return false;
  }
  
}
