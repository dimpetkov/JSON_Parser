package json_parse;

import com.fasterxml.jackson.databind.ObjectMapper;
import users.Student;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class JsonWriter {

    public static void jsonFileWriter(List<Student> student, String filePath) throws IOException {
        ObjectMapper jsonFileMapper = new ObjectMapper();
        jsonFileMapper.writeValue(Paths.get(filePath).toFile(), student);
    }
}
