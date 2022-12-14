import java.io.*;
import static common.Messages.*;
import static json_processor.JsonReader.studentsJsonDetailsReader;
import static json_processor.JsonWriter.jsonFileWriter;
import models_rank.LowGradeStudents;
import models_rank.UpperGradeStudents;

public class Main {

    public static void main(String[] args) throws IOException {

         jsonFileWriter(new LowGradeStudents().filterStudent(studentsJsonDetailsReader(JSON_FILE)),
                 LOWER_STUDENTS_JSON_FILE);

         jsonFileWriter(new UpperGradeStudents().filterStudent(studentsJsonDetailsReader(JSON_FILE)),
                 UPPER_STUDENTS_JSON_FILE);

    }
}
