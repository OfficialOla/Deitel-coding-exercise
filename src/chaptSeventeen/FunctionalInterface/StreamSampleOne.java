package chaptSeventeen.FunctionalInterface;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamSampleOne {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4);
//        System.out.println(nums
//                .stream()
//                .map(x -> x + 5)
//                .map(x -> x - 2)
//                .toList());
//        System.out.println(IntStream
//                .rangeClosed(0, 10)
//                .boxed()
//                .collect(Collectors.toList()));
//        int val = IntStream
//                .rangeClosed(0, 10)
//                .boxed()
//                .reduce(0, Integer::sum);
//        System.out.println(val);
        Random random = new Random();
        System.out.println(IntStream
                .rangeClosed(0, 20)
                .filter(x -> x % 2 == 0)
                .boxed()
                .toList()
                .stream().toList());

//        System.out.println(IntStream
//                .generate(() -> )
//                .limit()
//                .boxed()
//                .toList());

//        System.out.println(IntStream
//                .iterate(0, i -> i < 20, x -> x + 2)
//                .boxed()
//                .toList()
//                .stream().toList());
        List<String> names = List.of(
                "Yinka",
                "Prof",
                "Joshua",
                "Zainab",
                "James"
        );
        System.out.println(names
                .stream()
                .collect(Collectors.toMap(x -> x, String::length)));


//        System.out.println(names
//                .stream()
//                .map(String::toUpperCase)
//                .filter(x -> x.length() < 5)
//                .toList());

    }
    public static List<Integer> mapMethod(List<Integer> numbers){
        return numbers
                .stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());
    }

}
