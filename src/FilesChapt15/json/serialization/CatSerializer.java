package FilesChapt15.json.serialization;

import FilesChapt15.json.Cat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.SocketTimeoutException;

public class CatSerializer {
    public static String convertCatToJson(Cat cat){
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            return objectMapper.writeValueAsString(cat);
        }catch (JsonProcessingException exception){
            System.err.println(exception.getMessage());
        }
        return null;
    }

}
