package ChaptSixteen;

import chaptSeventeen.FunctionalInterface.Student;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CollectionSample2 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Tinuade(AKA Birthday geh)");
        names.add("Folahan(AKA 9kicks)");
        names.add("Sgreen(AKA 9kicks)");
        names.add("Folahan(AKA 9kickz)");
        names.add("Balablue");
        System.out.println(names);

        System.out.println(names.toArray()[names.toArray().length-4]);

        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 50;
        numbers[2] = 12;
        numbers[3] = 98;
        numbers[4] = 34;

        System.out.println(Arrays.toString(Arrays.stream(numbers).toArray()));
    }
}
