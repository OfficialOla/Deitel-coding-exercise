package chaptSeventeen.FunctionalInterface;

import java.util.function.IntConsumer;
import java.util.function.Predicate;

public class IntConsumerSample {
    public static void main(String[] args) {
        IntConsumer intConsumer = System.out::print;
        intConsumer.accept(500);

    }

}
