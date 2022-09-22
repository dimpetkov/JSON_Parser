package models_rank;

import java.util.List;

import models.Student;

public class LowGradeStudents implements RankAPI{

    @Override
    public List<Student> filterStudent(List<Student> students) {

        return students.stream().filter(student -> student.getRank() < 3).toList();
    }
}
