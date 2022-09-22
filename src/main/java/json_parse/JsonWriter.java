package json_parse;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.Student;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class JsonWriter {

    public static void jsonFileWriter(List<Student> students, String filePath) throws IOException {
        ObjectMapper jsonFileMapper = new ObjectMapper();
        jsonFileMapper.writeValue(Paths.get(filePath).toFile(), students);
    }
}
