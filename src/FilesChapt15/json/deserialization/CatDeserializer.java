package FilesChapt15.json.deserialization;

import FilesChapt15.json.Cat;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class CatDeserializer {
    public static Cat deserializeJsCat(String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(json.getBytes(), Cat.class);
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
        return null;
    }
}