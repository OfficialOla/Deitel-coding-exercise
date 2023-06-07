package ArrayList;

public class MultiDiArray {
    public static void main(String[] args) {
        char[][] arr = {{'x', 'o', 'x'},{'o', 'o', 'x'},{'x', 'o', 'o'}};
        multiArr(arr);
    }


    public static void multiArr(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(7);
        for (char[] chars : arr) {
            for (char aChar : chars) {
                if (aChar == 'x') {
                    System.out.print(1+ " ");
                } else {
                    System.out.print(0+ " ");
                }

             }
            System.out.println();
        }
    }
}
