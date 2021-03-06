package step13.v3;

public class LinkedList {
  Box head;
  Box tail;
  int length;

  public LinkedList() {
    head = new Box();
    tail = head;
  }

  public void add(Object value) {
    tail.value = value;
    tail.next = new Box();
    tail = tail.next;
    length++;
  }

  public Object get(int index) {
    if (index < 0 || index >= length) {
      System.out.println("인덱스가 유효하지 않습니다.");
      return null;
    }

    Box cursor = head;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }

  public Object set(int index, Object newValue) {
    if (index < 0 || index >= length) {
      System.out.println("인덱스가 유효하지 않습니다.");
      return null;
    }

    Box cursor = head;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }

    Object oldValue = cursor.value;
    cursor.value = newValue;
    return oldValue;
  }

  public Object remove(int index) {
    if (index < 0 || index >= length) {
      System.out.println("인덱스가 유효하지 않습니다.");
      return null;
    }

    Object oldValue = null;
    if (index == 0) {
      oldValue = head.value;
      head = head.next;
    } else {
      Box cursor = head;
      for (int i = 0; i < (index - 1); i++) {
        cursor = cursor.next;
      }
      oldValue = cursor.next.value;
      cursor.next = cursor.next.next;
    }
    length--;
    return oldValue;
  }

  public int size() {
    return length;
  }



  //특정 클래스에서만 사용하는 클래스라면 바깥보다는 클래스 안에 둘 것.
  private class Box {
    Object value;
    Box next;


    public Box() {}

    public Box(Object value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return "Box(" + this.value + ")";
    }
  }
}
