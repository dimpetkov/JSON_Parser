package users_rank;

import models.Student;

import java.util.List;

public interface RankAPI {
    List<Student> filterStudent(List<Student> students);
}
