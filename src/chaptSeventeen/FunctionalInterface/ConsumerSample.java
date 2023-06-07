package chaptSeventeen.FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        consumerDeclarative.accept("Regnos");
        consumerImperative("CohortFourteen");

    }
    static Consumer<String> consumerDeclarative = System.out::println;

    public static void consumerImperative(String name){
        System.out.println(name);
    }
}
