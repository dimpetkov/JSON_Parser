package users_rank;

import users.Student;

import java.util.List;

public interface RankAPI {
    List<Student> rankStudent(List<Student> allStudents);
}
