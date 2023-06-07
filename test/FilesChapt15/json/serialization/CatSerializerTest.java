package FilesChapt15.json.serialization;

import FilesChapt15.json.Cat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class CatSerializerTest {
    private Cat cat;
    private final LocalDateTime dateOfBirth = LocalDateTime.now().minusYears(20);
    private DateTimeFormatter dateTimeFormatter;
    @BeforeEach
    public void setUp() {
        dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        cat = new Cat();
        cat.setAge(20);
        cat.setName("Tom");
        cat.setDateOfBirth(dateOfBirth);
    }


        @Test
        public void testConvertCatToJson() {
            String catJson = CatSerializer.convertCatToJson(cat);
            assertNotNull(catJson);
            System.out.println(catJson);
            assertEquals("{\"name\":\"Tom\",\"age\":20,\"birthday\":"+"\""+ dateTimeFormatter.format(dateOfBirth)+"\""+"}", catJson);
        }
        @Test
        public void testConvertCatToJsonIgnoresNullValues(){
        cat.setName(null);
            String catJson = CatSerializer.convertCatToJson(cat);
            assertNotNull(catJson);
            System.out.println(catJson);
            assertEquals("{\"age\":20,\"birthday\":"+"\""+ dateTimeFormatter.format(dateOfBirth)+"\""+"}", catJson);
        }
        }


