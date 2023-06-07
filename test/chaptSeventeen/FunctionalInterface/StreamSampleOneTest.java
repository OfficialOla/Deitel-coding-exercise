package chaptSeventeen.FunctionalInterface;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StreamSampleOneTest {
    @Test
    void testThatMapReturnsElementOfAListMultiplyingEachElementByTwo(){
        List<Integer> numbers = List.of(1,2,3,4);
        var actual = StreamSampleOne.mapMethod(numbers);
        var expected = List.of(2,4,6,8);
        assertEquals(actual, expected);
    }
    @Test
    void testThatMapCanBeSorted(){
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("AB", 2);
        map.put("C", 4);
        map.put("D", 3);

        Map<String, Integer> result = Example.sortMap(map);
        assertNotNull(result);
        System.out.println(map);
        assertTrue(result.entrySet().size()>0);

    }

}