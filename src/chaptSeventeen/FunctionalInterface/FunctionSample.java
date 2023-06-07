package chaptSeventeen.FunctionalInterface;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
        Function<Integer, Integer> result = functionOne.andThen(functionTwo);
        System.out.println(result.apply(10));
    }
    static Function<Integer, String> functionOne = input -> input * 20 + "";
    static  Function<String, Integer> functionTwo = name -> name.length();

    public static int multiplyByTwenty(int input){
        return input * 20;
    }
}
