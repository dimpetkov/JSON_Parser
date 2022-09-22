package json_parse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Student;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;


public class JsonReader {

    public static List<Student> studentsJsonDetailsReader(String filePath) throws IOException {
        ObjectMapper jsonFileMapper = new ObjectMapper();

        return jsonFileMapper.readValue(Paths.get(filePath)
                .toFile(), new TypeReference<>() {});
    }
}
