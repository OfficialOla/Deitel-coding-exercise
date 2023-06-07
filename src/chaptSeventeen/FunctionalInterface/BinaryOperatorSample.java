package chaptSeventeen.FunctionalInterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
        System.out.println(binaryOperator.apply("Olayinka", "Olaoluwa"));
    }
    static BinaryOperator<String> binaryOperator =
            (firstname, lastname) -> firstname + " "+lastname;
}
