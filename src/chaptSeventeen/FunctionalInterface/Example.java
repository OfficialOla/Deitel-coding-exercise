package chaptSeventeen.FunctionalInterface;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//
//public class Example {
////    public static void main(String[] args) {
////       List<Integer>list = List.of(1,2,3,4,5);
////        System.out.println(list.stream()
////                .filter((number) -> number % 2 != 0)
////                .collect(Collectors.toList()));
////    }
//}
public class Example {
    public static void main(String[] args) {
//        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
//        stream1.forEach(System.out::print);

        Stream<Integer> stream2 = Stream.empty();
//        stream2.forEach(System.out::print);

        Stream.generate(() -> new Random().nextInt(10));
//                .limit(5)
//                .forEach(System.out::println);
        Stream.iterate(1, (number) -> number + 1);
//                .limit(5)
//                .forEach(System.out::print);

//        Stream<Integer> s = Stream.generate(()->1)
//                .filter(s.reduce(0, (x, y) -> ))
//                .forEach(System.out::print);
        List<String> names = List.of(
                "Ade",
                "Kenny",
                "Yinka",
                "AAA",
                "Dolapo",
                "Dolapo"
        );
//        System.out.println(names.stream()
//                .collect(Collectors.joining("/")));
//    }
//        String s1 = names.stream()
//                .collect(Collectors.joining(",", "", "+"));
//        System.out.println(s1);
//        Map<Integer, List<String>> map = names.stream()
//                .collect(Collectors.groupingBy((name) -> name.length()));
////        System.out.println(map);
//        Map<Boolean, List<String>> map = names.stream()
//                .collect(Collectors.partitioningBy((w) ->w.length() %2 == 0));
//        System.out.println(map);
//The set does not return duplicant element in the stream
//       Map<Boolean, Set<String>> map1 = names.stream()
//                .collect(Collectors.partitioningBy((w)->w.length() % 2 == 0, Collectors.toSet()));
//        System.out.println(map1);

//        Flatmap
        System.out.println(names.stream()
//                split returns array of strings and not character
                .flatMap(s -> Stream.of(Arrays.stream(s.split(""))))
                .collect(Collectors.toList()));


    }

    public static Map<String, Integer> sortMap(Map<String, Integer> map) {
        Map<String, Integer> result = new TreeMap<>(Comparator.naturalOrder());
        result.putAll(map);
        return result;
    }

}