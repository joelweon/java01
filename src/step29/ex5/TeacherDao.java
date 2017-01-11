package step29.ex5;

import java.util.List;

// 인터페이스를 만드는 이유 ? 오라클이든 mysql이든 확장성을 위해 만든 것.
public interface TeacherDao {
  List<Teacher> selectList();
}
