package chaptSeventeen.FunctionalInterface;

import java.util.Arrays;

public class LambdaAndStreams {

    public static void main(String[] args) {
        int[] l = new int[]{1, 2, 3, 4};
        System.out.println(((Arrays.stream(l).filter(X -> X % 2 == 0).max())));


    }
}
