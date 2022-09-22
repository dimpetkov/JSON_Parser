import java.io.*;
import static common.Messages.*;
import static json_parse.JsonReader.studentsJsonDetailsReader;
import static json_parse.JsonWriter.jsonFileWriter;
import users_rank.LowGradeStudents;
import users_rank.UpperGradeStudents;

public class Main {

    public static void main(String[] args) throws IOException {

         jsonFileWriter(new LowGradeStudents().filterStudent(studentsJsonDetailsReader(JSON_FILE)),
                 LOWER_STUDENTS_JSON_FILE);

         jsonFileWriter(new UpperGradeStudents().filterStudent(studentsJsonDetailsReader(JSON_FILE)),
                 UPPER_STUDENTS_JSON_FILE);

    }
}
