package users_rank;

import users.Student;

import java.util.ArrayList;
import java.util.List;

public class UpperGradeStudents implements RankAPI{
    @Override
    public List<Student> rankStudent(List<Student> allStudents) {
        List<Student> lowerGradeStudents = new ArrayList<>();

        for(Student student : allStudents) {
            if (student.getRank() >= 3) {
                lowerGradeStudents.add(student);
            }
        }
        return lowerGradeStudents;
    }
}
