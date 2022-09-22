package models_rank;

import models.Student;

import java.util.List;


public class UpperGradeStudents implements RankAPI{
    @Override
    public List<Student> filterStudent(List<Student> students) {

        return students.stream().filter(student -> student.getRank() >= 3).toList();
    }
}
