package chaptSeventeen.FunctionalInterface;

import java.util.function.BiFunction;

public class BiFunctionSample {
    public static void main(String[] args) {
        System.out.println(biFunction.apply(10, 20));
    }
    static BiFunction<Integer, Integer, String> biFunction =
            (inputOne, inputTwo) -> inputOne + inputTwo + " A String";
}
