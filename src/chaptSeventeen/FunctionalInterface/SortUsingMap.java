package chaptSeventeen.FunctionalInterface;

import ArrayList.ArrList;

import java.util.*;
import java.util.stream.Collectors;

public class SortUsingMap {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("Fola", 21);
        studentMap.put("Yinka", 15);
        studentMap.put("Spencer", 15);
        studentMap.put("Renike", 20);

//        Map<String, Integer> sorted = studentMap.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue() )
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        Map.Entry::getValue,
//                        (x, y) -> x, LinkedHashMap::new));
//        System.out.println(sorted);

        var list = new ArrayList<>(studentMap.entrySet());
        list.sort((x, y) -> x.getValue().compareTo(y.getValue()));
        System.out.println(list);


    }
}
