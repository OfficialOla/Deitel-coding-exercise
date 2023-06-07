package chaptSeventeen.FunctionalInterface;

import java.util.function.Predicate;

public class PredicateSample {
    //TODO This takes a single argument and return a boolean value after it's operation
    public static void main(String[] args) {
//        System.out.println(predicate.test(101));
//        Predicate<Integer> and = predicate.and(after);
//        System.out.println(and.test(100));
        System.out.println(predicate.and(after).test(10));

    }
    static Predicate<Integer> predicate = input -> input % 2 == 0;
    static Predicate<Integer> after = afterInput -> afterInput >= 5;
}
