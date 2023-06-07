package FilesChapt15.json.deserialization;

import FilesChapt15.json.Cat;
import FilesChapt15.json.serialization.CatSerializer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class CatDeserializerTest {
    private String catJson;
    private DateTimeFormatter dateTimeFormatter;
    private final LocalDateTime dateOfBirth = LocalDateTime.now().minusYears(20);


    @BeforeEach
    void setUp() {
        dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
         catJson = "{\"name\":\"Crocs\",\"age\":30,\"birthday\":"+"\""+dateTimeFormatter.format(dateOfBirth)+"\""+"}";
    }

    @Test
    void deserialization(){
        Cat ologbo = CatDeserializer.deserializeJsCat(catJson);
        assertNotNull(ologbo);
        assertEquals("Crocs", ologbo.getName());
        assertEquals(dateTimeFormatter.format(dateOfBirth), dateTimeFormatter.format(ologbo.getDateOfBirth()));
    }
}