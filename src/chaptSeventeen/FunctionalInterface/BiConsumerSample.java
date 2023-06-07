package chaptSeventeen.FunctionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        biConsumer.accept("Olayinka", 33);
        printNameAge("Josh", 29);

    }
    static BiConsumer<String, Integer> biConsumer = (name, age) -> System.out.println(name + " " +age);
    public  static  void printNameAge(String name, Integer age){
        System.out.println(name +" " +age);
    }
}
